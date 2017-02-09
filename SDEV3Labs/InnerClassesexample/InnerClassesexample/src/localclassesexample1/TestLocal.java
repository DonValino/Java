package localclassesexample1;

import java.util.*;

public class TestLocal {
	public void displayTime() {
		// Example of a local class - Class that is defined within a single
		// method

		Date now = new Date();
		System.out.println("The date and time are " + now);
	}

	public static void main(String args[]) {
		TestLocal tl = new TestLocal();
		tl.displayTime();

	}

}

