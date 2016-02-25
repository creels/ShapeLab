package lab;

public class Square {

	double side;
	
	public double getSide()
	{
		return side;
	}
	
	public void setSide(double side)
	{
		this.side = side;
	}
	
	
	public double getArea()
	{
		return side * side;
	}
	
	 double getPerimeter()
	{
		return side * 4;
	}
}
