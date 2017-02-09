package Lab11;

/**
 * Created by x00112730 on 28/10/2014.
 */
public class University {
    //Member Variables
    private String name;
    private Department [] dList;

    //Constructor
    public University(String uName,String [] deptName,int [] deptId)
    {
        name = uName;
        dList = new Department[deptId.length];
        for (int i = 0; i < dList.length;i++)
        {
            dList[i] = new Department(deptId[i],deptName[i]);
        }
    }

    //Getter
    public String getName()
    {
        return name;
    }

    //Setter
    public void setName(String in)
    {
        name = in;
    }

    //Showlist
    public void showList()
    {
        for(int i = 0; i < dList.length;i++)
        {
            System.out.println("Department name is : " + dList[i].getName() + "\nID is : " + dList[i].getDeptID());
        }
    }

    //InnerClass
    class Department {
        //Member Variables
        private int deptID;
        private String name;

        //Constructor
        public Department(int id,String n)
        {
            deptID = id;
            name = n;
        }

        //Getter
        public int getDeptID()
        {
            return deptID;
        }

        //Getter
        public String getName()
        {
            return name;
        }

        //Setter
        public void setDeptID(int id)
        {
            deptID = id;
        }

        //Setter
        public void setName(String nameIn)
        {
            name = nameIn;
        }


    }

}
