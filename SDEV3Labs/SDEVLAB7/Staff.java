package SDEVLAB7;

/**
 * Created by Valino on 14/10/14.
 */
public class Staff {
    //Member Variables
    StaffMember [] pList = new StaffMember[8];

    //Constructor
    public Staff()
    {
        pList[0] = new Executive("John","1This St","0874323476","R6574635",2423.07);
        pList[1] = new Employee("Paul","2 That St","08544345222","P8884635",1246.15);
        pList[2] = new Employee("Dave","3 Other St","0864343566","S9876635",1169.23);
        pList[3] = new Hourly("Joanne","4 Long Ave.","0836789676","T0987635",10.55);
        pList[4] = new Volunteer("Norma","5 Short Ave.","0864323456");
        pList[5] = new Volunteer("Kate","6 Pecks Lane","0854676767");
        pList[6] = new Commission("Molly","7 Nowhere Road","0864326789","L6599635",6.25,.2);
        pList[7] = new Commission("Joe","8 My Place","0864344545","G8888635",9.75,.15);
    }

    //processStaff()
    public void processStaff()
    {
       if(pList[0] instanceof Executive)
       {
           Executive e = (Executive) pList[0];
           e.awardBonus(500);
       }
       if(pList[3] instanceof Hourly)
       {
           Hourly h = (Hourly) pList[3];
           h.addHours(40);
       }
        if(pList[6] instanceof Commission)
        {
            Commission c = (Commission) pList[6];
            c.addHours(35);
            c.addSales(400);
        }
        if(pList[7] instanceof Commission)
        {
            Commission c1 = (Commission) pList[7];
            c1.addHours(40);
            c1.addSales(950);
        }
    }

    //payDay()
    public void payDay()
    {
        System.out.println(pList[0].toString());
        System.out.println("Paid : " + pList[0].pay());
        System.out.println(pList[1].toString());
        System.out.println("Paid : " + pList[1].pay());
        System.out.println(pList[2].toString());
        System.out.println("Paid : " + pList[2].pay());
        System.out.println(pList[3].toString());
        System.out.println("Paid : " + pList[3].pay());
        System.out.println(pList[4].toString());
        System.out.println(pList[5].toString());
        pList[5].pay();
        System.out.println(pList[6].toString());
        pList[5].pay();
        System.out.println("Paid : " + pList[6].pay());
        System.out.println(pList[7].toString());
        System.out.println("Paid : " + pList[7].pay());



    }


}
