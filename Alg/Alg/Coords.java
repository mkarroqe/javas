// Mary Karroqe PD 4/5

public class Coords
{
	private double x, y;

	public Coords(double xValue, double yValue)
	{
		this.x = xValue;
		this.y = yValue;
	}

	public Coords()
	{
		this(0,0);
		/* same thing as:
			x = 0;
			y = 0;
			OR
			this(0);
			OR
			this(0.0);
		*/
	}

	public Coords(double value)
	{
		this(value, value);
	}
	public Coords(Coords other)
	{
		this.x = other.x;
		this.y = other.y;

	 // OR:
	 // this(other.x, other.y);
	}

	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}

	// ACCESSORS
	public double getX()
	{
		return x;
	}

	public double getY()
	{
		return y;
	}

	public boolean equals(Coords other)
	{
		return this.x == other.x && this.y == other.y;
	}

	// MUTATORS
	public void setX(double value)
	{
		// returning a void
		x = value;
	}

	public void setY(double value)
	{
		// returning a void
		y = value;
	}

	public void translate(double horShift, double verShift)
	{
		x = x + horShift;
		y = y + verShift;
	}

	public void translate(double translation)
	{
	//	x += translation;
	//	y += translation;

	//or
	translate(translation, translation);
	// looks for a translate method that accepts two parameters (the one above) and uses translation as the parameters

	}

	public void reflectOnXAxis()
	{
		y = -y;
	}

	public void reflectOnYAxis()
	{
		x = -x;
	}

	public void reflectOnOrigin()
	{
		reflectOnXAxis();
		reflectOnYAxis();
	}

	public boolean dilate(double dilationFactor)
	{
		if (dilationFactor <= 0) {
			return false;
			// return ends a method
		}
		x = x * dilationFactor;
		y = y * dilationFactor;
		return true;
	}

	public double distanceFromOrigin()
	{
	 // return Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
		return Math.hypot(x, y);
	}

	public double distanceFrom(Coords other)
	{
		// object calling the method is the "this"
		double deltaX = this.x - other.x;
		double deltaY = this.y - other.y;

		return Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));

	 // OR:
	 // double deltaX = this.getX - other.getX;
     // double deltaX = this.getY - other.getY;
	}

	public double slopeOfLineConnectingTo(Coords other)
	{
		double deltaX = other.x - this.x;
		double deltaY = other.y - this.y;
		return deltaY / deltaX;
	}

}