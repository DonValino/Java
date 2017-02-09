package Lab9;

/**
 * Created by x00112730 on 21/10/2014.
 */
public class TestShape {
    public static void main(String [] args) {
        Shape [] shapes;
        shapes = new Shape[4];

        shapes[0] = new Circle(22,88,4,4);
        shapes[1] = new Square(71,96,10,10);
        shapes[2] = new Sphere(8,89,4,4,4);
        shapes[3] = new Cube(79,61,8,8,8);

        for(int i = 0; i < shapes.length;i++)
        {
            System.out.println("");
            System.out.println(shapes[i].toString());
            if(shapes[i] instanceof TwoDShape)
            {
                TwoDShape d = (TwoDShape) shapes[i];
                System.out.println("Area of " + d.getName() + " is : " + d.getArea());
            }
            if(shapes[i] instanceof ThreeDShape)
            {
                ThreeDShape dd = (ThreeDShape) shapes[i];
                System.out.println("Area of " + dd.getName() + " is : " + dd.getArea());
                System.out.println("Volume of " + dd.getName() + " is : " + dd.getVolume());
            }

        }
    }
}
