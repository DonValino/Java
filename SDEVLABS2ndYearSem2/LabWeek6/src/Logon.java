import java.io.Serializable;

/**
 * Created by x00112730 on 09/03/2015.
 */
public class Logon implements Serializable {
    private String username;
    private transient String password;

    public Logon(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String toString(){
        if(password == null)
        {
           password = "N/A" ;
        }

         return "UserName: " + username + " Password: " + password;

    }
}
