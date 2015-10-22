// Mary Karroqe PD 4/5

public class Test
{
	public static void main(String args[])
	{
/*		Coords pt1 = new Coords();
		Coords pt2 = new Coords(4, -7);
		Coords pt3 = new Coords(8);

		// when your print an object, it displays hex value of where it is stored in memory, inherited from Object class
		// our own toString method overrides the original one and corrects this! :D
		System.out.println(pt1);
		System.out.println(pt2);
		System.out.println(pt3);

		System.out.println();

		// x of the first point
		double xPt1 = pt1.getX();
		System.out.println(xPt1);

		// y of the second point
		double xPt2 = pt2.getY();
		System.out.println(xPt2);

		// testing out our setX and setY mutators
		pt3.setX(-2.5);
		pt3.setY(6);
		System.out.println(pt3);

		// testing out our translate mutator
		pt2.translate(-3, 3.5);
		System.out.println(pt2);

		// testing out our reflectOnOrigin mutator
		pt1.reflectOnOrigin();
		System.out.println(pt1);

		// testing out our dilate mutator
		pt3.dilate(2);
		System.out.println(pt3);

		System.out.println();

		// testing out distanceFromOrigin()
		System.out.println(pt2);
		double dist = pt2.distanceFromOrigin();
		System.out.println(dist);

		System.out.println();

		// testing out distanceFrom()
		System.out.println(pt2);
		System.out.println(pt3);
		double dist2 = pt2.distanceFrom(pt3);
		System.out.println(dist2);

		// testing out Coords(Coords other) action- copycat constructor
		System.out.println(pt3);
		Coords pt4 = new Coords(pt3);
		pt4.translate(2, -3);
		System.out.println(pt4);

		System.out.println();

		// testing out slopeOfLineConnectingTo()
		System.out.println(pt3);
		System.out.println(pt4);
		double slope = pt3.slopeOfLineConnectingTo(pt4);
		System.out.println(slope);

		System.out.println();

		// testing out slopeOfLineConnectingTo() in a case that would be undefined:
		Coords pt5 = new Coords(10, 1);
		System.out.println(pt4);
		System.out.println(pt5);
		slope = pt4.slopeOfLineConnectingTo(pt5);
		System.out.println(slope);

		// dividing by zero with ints -> runtime error
		// dividing by zero with doubles -> takes the limit (neg or positive infinity)

*/		// testing out pointOfIntersection()
		LinearEquation line1 = new LinearEquation(2, 3, 6);
		LinearEquation line2 = new LinearEquation(5, 2, 20);
		Coords intersection = line1.pointOfIntersection(line2);
		System.out.println(intersection);

		System.out.println();
		// testing boolean equals
		Coords pt1 = new Coords(4, -7);
		Coords pt2 = new Coords(4, -7);
		boolean areEqual = pt1.equals(pt2);
		System.out.println(areEqual);

	}
}