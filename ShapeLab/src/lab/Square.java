package lab;

public class Square implements Shape {

	double side;
	
	public Square(double side){
		this.side = side;
	}
	
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
	
	 public double getPerimeter()
	{
		return side * 4;
	}
	 
	 public String toString(double area, double perimeter){
			return String.format("A Square with a side length of %,.3f, "
					+ "an area of %,.3f, and a perimeter of %,.3f.", side,area,perimeter);
			
		}
}
