//Mary Karroqe PD 4/5

public class ComplexNumber
{
	// a + bi
	private double a, b;

	//constructor
	public ComplexNumber(double realPart, double imaginaryPart)
	{
		a = realPart;
		b = imaginaryPart;
	}

	// copy constructor
	public ComplexNumber(ComplexNumber other)
	{
		this(other.a, other.b);
	}

	public void add(double scalar)
	{
		 this.a += scalar;
	}

	public void add(ComplexNumber other)
	{
		this.a += other.a;
		this.b += other.b;
	}

	public void subtract(double scalar)
	{
		this.a -= scalar;
	}

	public void subtract(ComplexNumber other)
	{
		this.a -= other.a;
		this.b -= other.b;
	}

	public void multiply(double scalar)
	{
		this.a *= scalar;
		this.b *= scalar;
	}

	public void multiply(ComplexNumber other)
	{
		double c = other.a;
		double d = other.b;

		/*
		  	(a+bi)(c+di)
			ac + bdi^2 + bci + adi^2

			i^2 = -1 so:

			ac - bd + (bc + ad)i
			  ^^a		^^b

		*/

		double mutatedA = a*c - b*d;
		double mutatedB = b*c + a*d;
		a = mutatedA;
		b = mutatedB;

	}

	public boolean divideBy(double scalar)
	{
		if (scalar == 0)
			return false;

		this.a /= scalar;
		this.b /= scalar;
		return true;
	}

	public boolean divideBy(ComplexNumber other)
	{
		if (other.a == 0 && other.b == 0)
			return false;

		double c = other.a;
		double d = other.b;

		double mutatedA = (a*c + b*d) / ((Math.pow(c,2)) + (Math.pow(d,2)));
		double mutatedB = (b*c - a*d) / ((Math.pow(c,2)) + (Math.pow(d,2)));

		a = mutatedA;
		b = mutatedB;
		return true;

		/*

		double real = a*c + b*a;
		double imaginary = b*c - a*d;

		ComplexNumber temp = new ComplexNumber(real, imaginary);
		double divisor = Math.pow(c, 2) + Math.pow(d, 2);
		temp.divideBy(divisor);

		a = temp.a;
		b = temp.b;

		*/

	}

	public String toString()
	{
		String realPart = "";
		String imaginaryPart = "";

		if (a == 0 && b == 0)
			return "0";

		if (a != 0)
		{
			realPart = "" + a;
			if (b != 0)
			{
				if (b > 0)
					imaginaryPart = " + " + b + "i";
				else
					imaginaryPart = " - " + (-1 * b) + "i";
			}
		}
		else
			imaginaryPart = b + "i";

		return realPart + imaginaryPart;
	}

//  accessors

	public double getRealMagnitude()
	{
		return a;
	}

	public double getImaginaryMagnitude()
	{
		return b;
	}

}

// ¯\_(?)_/¯