package Lab6;

/**
 * Created by x00112730 on 10/10/2014.
 */
public class TestBand {
    public static void main(String [] args)
    {
        //Member Variables
        String [] name = {"Jake","Gareth","Colm","Graham"};
        String [] insName = {"Guitar","Piano","Bass","Drum"};
        Rockband ob1 = new Rockband("SuckAss","SIZQK",name,insName);
        ob1.print();
        System.out.println("\n");


        if(ob1.changeRecordLabel("SIZQK"))
        {
            System.out.println("Error change in the record lebel cannot be the same ");

        }
        ob1.changeRecordLabel("ROCKY");


        ob1.print();


    }
}
