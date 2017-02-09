package localclassesexample1;

public class LocalInner {

	private double radius;

	public void doSomething() {
		final double pi = 3.1415;

		class Circle {
			public double area() {
				return pi * radius * radius;
			}
		}

		Circle c = new Circle();
		System.out.printf("$%,.2f%n",c.area());
	}

	public static void main(String[] args) {
		LocalInner x = new LocalInner();
		x.radius = 10;
		x.doSomething();
	}
}

