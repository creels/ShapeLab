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
}
