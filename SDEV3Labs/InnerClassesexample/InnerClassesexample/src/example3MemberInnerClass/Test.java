package example3MemberInnerClass;

/**
 * Created by Patricia on 19/10/2014.
 */
public class Test {
    public static void main(String[] args) {
        A a = new A();
        A.B b = a.new B();
        A.B.C c = b.new C();
        c.go();
    }
}


