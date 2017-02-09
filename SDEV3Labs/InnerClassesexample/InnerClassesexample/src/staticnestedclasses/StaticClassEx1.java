package staticnestedclasses;

/**
 * Created by Patricia on 19/10/2014.
 */
public class StaticClassEx1 {
    private static final String name = "Robert";
    private static String company = "O'Reilly";
    private int value = 5;

    public static class SomeClass {
        public void someMethod() {
            System.out.println(company);
            System.out.println(name);
            //System.out.println(value); // <= Compiler error
        }
    }

    public static void main(String[] args) {
        StaticClassEx1.SomeClass obj = new StaticClassEx1.SomeClass();
        obj.someMethod();
    }
}


