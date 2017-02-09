package example2MemberInnerClass;

public class Outer {
	private String greeting;

	private class Inner {
		private int repeat = 3;

		public void go() {
			for (int i = 1; i <= repeat; i++) {
				System.out.println(greeting);
			}
		}
	}

    public void setGreeting(String g)
    {
        greeting = g;
    }
	public void displayGreeting() {
		Inner x = this.new Inner();
		x.repeat = 2;
		x.go();
	}
}


