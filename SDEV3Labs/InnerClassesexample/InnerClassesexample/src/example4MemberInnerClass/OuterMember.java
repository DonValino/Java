package example4MemberInnerClass;

public class OuterMember {
	private int i = 10;
	private String s = "hello";

	private class InnerMember {
		public void test() {
			i = i + 10;

			System.out.println(i);
			System.out.println(s);
		}
	}
    public void sex()
    {
        InnerMember sex = new InnerMember();
        sex.test();
    }
}


