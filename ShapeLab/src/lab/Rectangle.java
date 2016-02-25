package lab;

public class Rectangle implements Shape {

	double sideA,
	sideB;
	
	public Rectangle(double sideA, double sideB){
		this.sideA = sideA;
		this.sideB = sideB;
	}
	
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
