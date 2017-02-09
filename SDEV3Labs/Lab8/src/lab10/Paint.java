package lab10;

import Lab9.*;

/**
 * Created by x00112730 on 24/10/2014.
 */
public class Paint {
    //Member Variable
    private double coverage;
    private static int total;

    //Constructor
    public Paint(double c) {
        coverage = c;
        total++;
    }

    //calcamount()
    public double calcAmount(Shape p) {
        int p11 = 0;
        double pp;
     if(p instanceof TwoDShape)
     {
        TwoDShape t = (TwoDShape) p;
         p11 = t.getArea();
     }
     else
     {
         if (p instanceof ThreeDShape )
         {
             ThreeDShape ta = (ThreeDShape) p;
             p11 = ta.getArea();
         }
     }
        pp = (double) (p11);
        return pp / coverage;
    }



    //total()
    public static int getTotal() {
        return total;
    }

    public static void main(String[] args) {
        Paint p1 = new Paint(70);

        Shape[] p = new Shape[4];
        p[0] =  new Circle(22,88,4,4);
        p[1] = new Square(71,96,10,10);
        p[2] = new Sphere(8,89,4,4,4);
        p[3] = new Cube(79,61,8,8,8);
        double maximum = Double.MIN_VALUE;
        double minimum = Double.MAX_VALUE;
        String maxName = "";
        String minName = "";
        double amount = 0;
        for (int i = 0; i < p.length; i++) {
            amount += p1.calcAmount(p[i]);
            System.out.println(p[i].toString());
            String name = p[i].getName();
            System.out.printf("Amount of paint required for %s" + " is %,.2f%n" , name, p1.calcAmount(p[i]));
            System.out.println("");
            if (p1.calcAmount(p[i]) > maximum) {
                maximum = p1.calcAmount(p[i]);
                maxName = p[i].getName();

            }

            if (p1.calcAmount(p[i]) < minimum) {
                minimum = p1.calcAmount(p[i]);
                minName = p[i].getName();
            }
        }
        System.out.printf("The total amount of paint required is %,.2f%n",amount,"litres");
        System.out.println("The name of the shape that requires the most paint is : " + maxName);
        System.out.println("The name of the shape that requires the least paint is : " + minName);
        System.out.println("The number of shapes created : " + Shape.gettotal());
    }
}