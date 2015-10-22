// Mary Karroqe PD 4/5

public class LinearEquation
{
	//ax + by + c = 0
	//instance variables

	//x coefficient
	private double a;

	//y coefficient
	private double b;

	//constant
	private double c;

	//constructor
	public LinearEquation(double xCoeff, double yCoeff, double constant)
	{
		a = xCoeff;
		b = yCoeff;
		c = constant;
	}

	//copy constructor
	public LinearEquation(LinearEquation other)
	{
		// this would find another constructor that's taking in 3 doubles (the constructor above)
		this(other.a, other.b, other.c);
	}

	public boolean isVertical()
	{
		return b == 0;
	}

	public boolean isHorizontal()
	{
		return a == 0;
	}

	public double slope()
	{
		// to find slope, isolate the y -> y = -(a/b)x - (c/b), then take slope
		return -a / b;
	}

	public double yIntercept()
	{
		return -c / b;
	}

	public double xIntercept()
	{
		return -c / a;
	}

	public Coords yInterceptCoords()
	{
		return new Coords(0, yIntercept());
	}

	public Coords xInterceptCoords()
	{
		return new Coords(xIntercept(), 0);
	}

	public Coords pointOfIntersection(LinearEquation other)
	{
		// avoiding dealing with negative and positive infinity as slopes
		if (this.isVertical() && other.isVertical())
			return null;

		if (this.isVertical() && other.isHorizontal())
			return new Coords(this.xIntercept(), other.yIntercept());

		if (this.isHorizontal() && other.isVertical())
			return new Coords(other.xIntercept(), this.yIntercept());

		if (this.slope() == other.slope())
			return null;
/*
		// multiply coefficients and subtract x's
		double multCoeff1 = Math.abs(other.a);
		double multCoeff2 = Math.abs(this.a);

		// not mentioning a's since they're cancelled out anyway

		double b1 = this.b * multCoeff2;
		double c1 = this.c * multCoeff2;

		double b2 = other.b * multCoeff1;
		double c2 = other.c * multCoeff1;

		// have to subtract everything to cancel out x's
		double finalB = b1 - b2;
		double finalC = c1 - c2;

		double yVal  = finalB / -finalC;

		// plug back into initial equation to find x
*/

		// GOLDMAN WAY
		double a1 = this.a;
		double b1 = this.b;
		double c1 = this.c;
		double a2 = other.a;
		double b2 = other.b;
		double c2 = other.c;

		double y = (a1*c2 - a2*c1) / (a2*b1 - a1*b2);
		double x = - (b1*y + c1) / a1;
		return new Coords(x, y);

	}

}