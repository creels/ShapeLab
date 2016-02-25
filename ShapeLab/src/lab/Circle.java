package lab;

public class Circle implements Shape {
	
	double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	
	public double getArea()
	{
		return Math.pow(radius, 2) * Math.PI;
	}
	
	
	public double getPerimeter()
	{
		return Math.PI * 2* radius;
	}
	
	public String toString(double area, double perimeter){
		return String.format("A Circle with a radius of %f, "
				+ "an area of %f, and a perimeter of %f.", radius,area,perimeter);
		
	}
}
