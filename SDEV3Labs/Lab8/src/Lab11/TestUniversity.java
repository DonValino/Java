package Lab11;

/**
 * Created by x00112730 on 28/10/2014.
 */
public class TestUniversity {
    public static void main(String [] args)
    {
        int [] ids = {1,2,3,4};
        String [] deptName = {"Computing","Business","Language","Engineering"};
        University ob1 = new University("ITT",deptName,ids);
        ob1.showList();
    }
}
