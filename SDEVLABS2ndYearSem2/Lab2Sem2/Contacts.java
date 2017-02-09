package Lab2Sem2;

/**
 * Created by Jake on 03/02/15.
 */
import oracle.jdbc.pool.OracleDataSource;

import java.sql.*;
import java.util.Scanner;

public class Contacts {
    private Connection conn;
    private Statement stmt;
    private PreparedStatement pstmt;
    private ResultSet rset;

    public void openDB() {
        String url;
        Scanner in = new Scanner(System.in);
        try {
            // Load the Oracle JDBC driver
            OracleDataSource ods = new OracleDataSource();

            System.out.println("Type global1 or home");
            String val = in.nextLine();

            if(val.equals("global1"))
            {
                ods.setURL("jdbc:oracle:thin:@//10.10.2.7:1521/global1");
                System.out.println("Enter your user name:");
                String uName = in.nextLine();
                ods.setUser(uName);
                System.out.println("Enter your password:");
                String uPass = in.nextLine();
                ods.setPassword(uPass);
            }
            else if(val.equals("home"))
            {
                ods.setURL("jdbc:oracle:thin:hr/hr@localhost:1521/XE");
                System.out.println("Enter your user name:");
                String uName = in.nextLine();
                ods.setUser(uName);
                System.out.println("Enter your password:");
                String uPass = in.nextLine();
                ods.setPassword(uPass);
            }

            conn = ods.getConnection();
            System.out.println("connected.");
        } catch (Exception e) {
            System.out.print("Unable to load driver " + e);
            System.exit(1);
        }
    }

    public void buildMContactTable() {
        try {
            String createString = "CREATE TABLE Contact "
                    + "(id NUMBER(5) PRIMARY KEY, name CHAR(25), address CHAR(25),phone NUMBER(20), email CHAR(30))";

            System.out.println("Table created ");
            stmt = conn.createStatement();
            stmt.executeUpdate(createString);

            String insertString1 = "INSERT INTO Contact(id,name,address,phone,email) values(1,"
                    + "'Peter','23 Lime Lane',018976543,'p.cassidy@b.com')";
            stmt.executeUpdate(insertString1);


            String insertString2 = "INSERT INTO Contact(id,name,address,phone,email) values(2,"
                    + "'Donal','2 Shelbourne rd',012336578,'d.oreilly@b.com')";
            stmt.executeUpdate(insertString2);

            String insertString3 = "INSERT INTO Contact(id,name,address,phone,email) values(3,"
                    + "'Mary','4 Richmond rd',019887654,'m.lawlor@b.com')";
            stmt.executeUpdate(insertString3);

            String insertString4 = "INSERT INTO Contact(id,name,address,phone,email) values(4,"
                    + "'Glen','4 Richmond Lane',011223876,'g.whelan@b.com')";
            stmt.executeUpdate(insertString4);

        } catch (SQLException ex) {
            System.out.println("ERROR1: " + ex.getMessage());
        }

    }


    public void add(int id, String name, String address,int phone,String email) {
        try {
            String queryString = "Select id, name, address, phone, email FROM Contact";
            pstmt = conn
                    .prepareStatement(queryString,
                            ResultSet.TYPE_SCROLL_SENSITIVE,
                            ResultSet.CONCUR_UPDATABLE);
            rset = pstmt.executeQuery();

            rset.moveToInsertRow();
            rset.updateInt(1, id);
            rset.updateString(2, name);
            rset.updateString(3, address);
            rset.updateInt(4, phone);
            rset.updateString(5, email);
            rset.insertRow();
            pstmt.executeUpdate();

        } catch (SQLException e2) {
            System.out.println("Error2 going to previous row" + e2.getMessage());
            System.exit(1);
        }
    }

    public void dropTables() {
        System.out.println("Checking for existing tables.");

        try {
            // Get a Statement object.
            stmt = conn.createStatement();
            ;

            try {
                // Drop the Movie table.
                stmt.execute("DROP TABLE Contact");
                System.out.println("Contact table dropped.");
            } catch (SQLException ex) {
                // No need to report an error.
                // The table simply did not exist.
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public void closeDB() {
        try {
            stmt.close();
            rset.close();
            conn.close();
            System.out.print("Connection closed");
        } catch (SQLException e) {
            System.out.print("Could not close connection ");
            e.printStackTrace();
        }
    }

    public void showDB() {
        String sqlStatement = "SELECT * FROM Contact";
        try {
            // Send the statement to the DBMS.
            rset = stmt.executeQuery(sqlStatement);

            // Display the contents of the result set.
            // The result set will have three columns.
            while (rset.next()) {
                System.out.println(rset.getInt(1) + " " + rset.getString(2)
                        + " " + rset.getString(3) + " " + "0" + rset.getInt(4) + " " + rset.getString(5));

            }
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }

    public void queryDB()
    {
        String sqlStatement1 = "SELECT count(*) FROM Contact";
        String sqlStatement2 = "SELECT phone FROM Contact WHERE name = 'Peter'";
        String sqlStatement3 = "SELECT * FROM Contact ORDER BY name";
        try {
            System.out.println("================Query 1=======================");
            rset = stmt.executeQuery(sqlStatement1);
            if (rset.next()) {
                System.out.println("The number of contacts in the database is: "+rset.getInt(1));

            }
            System.out.println("================Query 2=======================");
            rset = stmt.executeQuery(sqlStatement2);
            System.out.println("The phone number for Peter is:");
            while (rset.next()) {
                System.out.println("0" + rset.getInt(1));
            }
            System.out.println("================Query 3=======================");
            rset = stmt.executeQuery(sqlStatement3);
            while (rset.next()) {
                System.out.println(rset.getInt(1) + " " + rset.getString(2)
                        + " " + rset.getString(3) + " " + "0" + rset.getInt(4) + " " + rset.getString(5));
            }
        } catch (Exception ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
    }
}
