// Mary Karroqe PD 4/5

public class LinearEquation
{
	//ax + by + c = 0

	private double a;
	private double b;
	private double c;

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
		// cannot have a point of intersection if one of the lines is not valid
		if(!this.isValid() || !other.isValid())
			return null;

		// avoiding dealing with negative and positive infinity as slopes
		if (this.isVertical() && other.isVertical())
			return null;

		if (this.isVertical() && other.isHorizontal())
			return new Coords(this.xIntercept(), other.yIntercept());

		if (this.isHorizontal() && other.isVertical())
			return new Coords(other.xIntercept(), this.yIntercept());

		if (this.slope() == other.slope())
			return null;

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
		if (!this.isValid())
			return null;

		if (this.isVertical())
			return new LinearEquation(1, 0, -1 * point.getX());

		return new LinearEquation(this.slope(), point);
	}

	public LinearEquation perpendicularLine(Coords point)
	{
		if (!this.isValid())
			return null;

		if (this.isHorizontal())
			return new LinearEquation(1, 0, -1 * point.getX());

		if (this.isVertical())
			return new LinearEquation(0, 1, -1 * point.getY());

		return new LinearEquation(-1/this.slope(), point);
	}

	public String toString()
	{
	//	return a + "x + "+ b + "y + " + c + " = 0";
		String xPart = "";
		String yPart = "";
		String constantPart = "";

		if (a != 0)
			xPart = a + "x + ";

		if (b != 0)
		{
			// x has a non-zero coefficient
			if (a != 0)
			{
				if (b < 0)
					yPart = "- ";
				else
					yPart = "+ ";
				yPart = yPart + Math.abs(b) + "y ";
			}
			// x has a zero coefficient
			else
				yPart = b + "y ";
		}

		if (c != 0)
		{
			if (c < 0)
				constantPart = "- ";
			else
				constantPart = "+ ";
			constantPart = constantPart + Math.abs(c);
		}

		return xPart + yPart + constantPart + " = 0";
	}

	public boolean isValid()
	{
		return a!=0 || b!=0;
	}

	public double shortestDistanceFrom(Coords point)
	{
		LinearEquation perp = perpendicularLine(point);
		Coords intersection = pointOfIntersection(perp);
		return intersection.distanceFrom(point);

		// OR:
		// return pointOfIntersection(perpendicularLine(point)).distanceFrom(point);

	}

	public boolean isOnLine(Coords point)
	{
		double x = point.getX();
		double y = point.getY();
		double solve = (a*x) + (b*y) + c;

		if (solve == 0)
			return true;
		else
			return false;
	}
}