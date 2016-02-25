package lab;

public class RightTriangle implements Shape{
	//variables
		double area;
		double perimeter;
		double base;
		double height;
		
		public void setBase(double base){
			this.base = base;
		}
		
		public void setHeight(double height){
			this.height = height;
		}
		
		public double getBase(double base){
			return base;
		}
		
		public double getHeight(double height){
			return height;
		}
		
		public double getArea(){
			area = .5*base*height;
			return area;
		}
		
		public double getPerimeter(){
			double hypotnuse = base*base + height*height;
			perimeter = base + height + Math.sqrt(hypotnuse);
			return perimeter;
		}
		
		
		
}
