package lab;

public class Rectangle {

	double sideA,
	sideB;
	
	public double getSideA()
	{
		return sideA;
	}
	public double getSideB()
	{
		return sideB;
	}
	
	
	public void setSideA(double sideA)
	{
		this.sideA = sideA;
	}
	public void setSideB(double side)
	{
		this.sideA = sideB;
	}
	
	
	public double getArea()
	{
		return sideA * sideB;
	}
	public double getPerimeter()
	{
		return 2 * sideA + 2 * sideB;
	}
}
