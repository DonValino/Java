package example3MemberInnerClass;

public class A {
	private int x = 10;

	public class B {
		private int x = 15;

		public class C {
			private int x = 20;

			public void go() {
				System.out.println(x);
				System.out.println(this.x);
				System.out.println(B.this.x);
				System.out.println(A.this.x);
			}
		}
	}
}


