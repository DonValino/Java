package Lab5;

/**
 * Created by x00112730 on 07/10/2014.
 */
public class TestShape {


    public static void main(String [] args)
    {
        Shape [] ob1 = new Shape[4];

        ob1[0] = new Rectangle("red",4.0,5.0);
        ob1[1] = new Triangle("blue",4.0,5.0);
        ob1[2] = new Circle("black",9.0);
        ob1[3] = new Cylinder("Indigo",5.0,9.0);


        for(int i = 0; i < ob1.length; i++)
        {
            System.out.println("Shape : " + (i+1));
            ob1[i].print();
            System.out.println("Area is : " + ob1[i].calcArea());


            if(ob1[i] instanceof Cylinder)
            {
                Cylinder c = (Cylinder) ob1[i];
                System.out.println("Volume is : " + c.calcVolume());
            }
            System.out.println("");



        }



    }
}
