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

	public LinearEquation(double slope, double yIntercept)
	{
		// y = (slope)x + yIntercept
		// c = (slope)x - y + yIntercept
		// a = slope;
		// b = -1;
		// c = yIntercept;

		this(slope, -1, yIntercept);
	}

	public LinearEquation(double slope, Coords point)
	{
		a = slope;
		b = -1;
		c = point.getY() - (slope*point.getX());
	}

	public LinearEquation(Coords point1, Coords point2)
	{
		// sending this to the method we already wrote with a double and a coords obj as parameters, instead of rewriting
		this(point1.slopeOfLineConnectingTo(point2), point1);

	}

	//instantiates line that passes through point and is parallel to other
	public LinearEquation(LinearEquation other, Coords point)
	{
		// sending this to the method we already wrote with a double and a coords obj as parameters, instead of rewriting
		this(other.slope(), point);
	}

	//copy constructor
	public LinearEquation(LinearEquation other)
	{
		// this would find another constructor that's taking in 3 doubles (the constructor above)
		this(other.a, other.b, other.c);
	}

	public boolean equals(LinearEquation other)
	{
		// taking care of exception- if we're dealing w vertical lines
		// see if they're the same line, or if they're parallel
		if(this.isVertical() && other.isVertical())
			return (this.xIntercept() == other.xIntercept());

		return this.slope() == other.slope() && this.yIntercept() == other.yIntercept();
	}

	public boolean isVertical()
	{
		return b == 0;
	}

	public boolean isHorizontal()
	{
		return a == 0;
	}

	public boolean isParallelTo(LinearEquation other)
	{
		// vertical line exceptions
		// cannot compare slope in the case of two vertical lines?
		if (this.isVertical() && other.isVertical())
			return this.xIntercept() != other.xIntercept(); // if their x intercepts are not equal, the lines are parallel

		// slopes are equal and y intercepts are not equal (if they are the lines are colinear)
		return (this.slope() == other.slope() && this.yIntercept() != other.yIntercept());
	}

	public boolean isPerpendicularTo(LinearEquation other)
	{
		// vertical lines are never perpendicular
		if (this.isVertical() && other.isVertical())
			return false;

		// a vertical and horizontal line will always be perpendicular, but it doesn't meet the condition below
		if ((this.isVertical() && other.isHorizontal()) || (other.isVertical() && this.isHorizontal()))
			return true;

		// simpler - the products of the slopes should be negative 1 (negative reciprocals)
		return this.slope() * other.slope() == -1;
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

	// sending this to the method we already wrote with a double and a coords obj as parameters
	public LinearEquation parallelLine(Coords point)
	{
		/*
			LinearEquation other = new LinearEquation(this.slope(), point);
			return other;
		*/

		// works as long as we don't have a vertical line
		return new LinearEquation(this.slope(), point);
	}

	public LinearEquation perpendicularLine(Coords point)
	{
		// will not work with a horizontal or vertical line
		return new LinearEquation(-1/this.slope(), point);
	}

}