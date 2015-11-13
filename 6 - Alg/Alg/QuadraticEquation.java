// Mary Karroqe PD 4/5
// y = ax^2 + bx + c

public class QuadraticEquation
{
	private double a, b, c;

	// constructors
	public QuadraticEquation(double a, double b, double c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public QuadraticEquation(QuadraticEquation other)
	{
		this.a = other.a;
		this.b = other.b;
		this.c = other.c;
	}

	public QuadraticEquation()
	{
		// constructs y = x^2
		a = 1;
		b = 0;
		c = 0;
	}

	public QuadraticEquation(double coefficient, Coords vertex)
	{
		double q = coefficient;
		double h = vertex.getX();
		double k = vertex.getY();

		/* look at this sexy algebra

			q(x-h)^2 + k
			q(x^2 - 2hx + h^2) + k
			qx^2 - 2qhx + qh^2 + k

		*/

		a = q;
		b = -2 * q * h;
		c = q*Math.pow(h, 2) + k;
	}

	// if root1 and root2 are not conjugates, use only the real magnitude of the roots
	public QuadraticEquation (double coefficient, QuadraticRoots theRoots)
	{

	}

	public QuadraticEquation(LinearEquation derivative, Coords point)
	{
		// code here
	}

	public String toString()
	{
		return "y = " + a + "x^2 + " + b + "x + " + c;
	}

	public double getDiscriminant()
	{
		return Math.pow(b, 2) - 4 * a * c;
	}

	public QuadraticRoots getRoots()
	{
		if (hasRealRoots())
		{
			double r1 = (-b + Math.sqrt(getDiscriminant())) / (2 * a);
			double r2 = (-b - Math.sqrt(getDiscriminant())) / (2 * a);
			return new QuadraticRoots(r1, r2);
		}
		double real = -b / (2 * a);
		double imag = Math.sqrt(-1 * getDiscriminant()) / (2 * a);
		ComplexNumber root1 = new ComplexNumber(real, imag);
		return new QuadraticRoots(root1);
	}

/*	public Coords vertex()
	{
		double x = (-b) / (2 * a)
		// jermeyyyyyyyyyyyyyyyyyy
	}

	public boolean hasMinimum()
	{

	}

	public boolean hasMaximum()
	{

	}
*/
	public boolean hasRealRoots()
	{
		return getDiscriminant() >= 0;
	}

	public boolean hasEqualRoots()
	{
		return getDiscriminant() == 0;
	}

/*	public LinearEquation axisOfSymmetry()
	{

	}

	// extra accessor methods
	public LinearEquation derivative()
	{

	}

	public double slopeOfTangent(double xCoord)
	{

	}
*/
}