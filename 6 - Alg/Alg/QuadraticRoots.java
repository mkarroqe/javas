// Mary Karroqe PD 4/5

public class QuadraticRoots
{
	//instance variables
	private ComplexNumber root1;
	private ComplexNumber root2;

	//constructor
	//root1 is the parameter
	//root2 is the conjugate of the parameter
	public QuadraticRoots(ComplexNumber root)
	{
		root1 = root;
		double realPart = root.getRealMagnitude();
		double imaginaryPart = root.getImaginaryMagnitude();
		root2 = new ComplexNumber(realPart, -imaginaryPart);
	}

	//the roots are real; therefore the imaginary magnitude of each root is zero
	public QuadraticRoots(double r1, double r2)
	{
		root1 = new ComplexNumber(r1, 0);
		root2 = new ComplexNumber(r2, 0);
	}

	//accessors
	public ComplexNumber getRoot1()
	{
		return root1;
	}
	public ComplexNumber getRoot2()
	{
		return root2;
	}

	// accessors
	public String toString()
	{
		return "(" + root1.toString() + ", " + root2.toString() + ")";
	}

}