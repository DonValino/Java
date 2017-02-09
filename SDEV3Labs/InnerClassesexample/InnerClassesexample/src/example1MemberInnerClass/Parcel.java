package example1MemberInnerClass;

public class Parcel {
	class Contents {

		private String shipment = "Irish beef";

		public String getShipment() {
			return shipment;
		}
	}

	class Destination {

		private String label;

		Destination(String whereTo) {
			label = whereTo;
		}

		String readLabel() {
			return label;
		}
	}

	// Using inner classes looks just like
	// using any other class, within Parcel:

	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println("Package Contents:" + c.getShipment()
				+ "\nGoing To:" + d.readLabel());
	}
}


