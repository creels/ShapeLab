package lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File file = new File("data");
		Scanner tempeFile = new Scanner(file);
		
		int lines = 0;
		while (tempeFile.hasNextLine())
		{
			lines++;
		}
		tempeFile.close();
		
		Scanner shapeFile = new Scanner(file);

		String[] shapes = new String[lines];
		
		for(String shape : shapes)
		{
			shape = shapeFile.nextLine();			
		}
		
		shapeFile.close();
		
		double Area = 0,
		Perimeter = 0;
		String output = "";
		
		for(String line : shapes)
		{
			StringTokenizer splitLine = new StringTokenizer(line.trim(),",");
			
			switch(splitLine.nextToken())
			{
				case "Circle":
				{
					Circle circle = new Circle(Double.parseDouble(splitLine.nextToken()));
					Area = circle.getArea();
					Perimeter = circle.getPerimeter();
					output = circle.toString(Area,Perimeter);
					break;
				}
				case "Square":
				{
					Square square = new Square(Double.parseDouble(splitLine.nextToken()));
					Area = square.getArea();
					Perimeter = square.getPerimeter();
					output = square.toString(Area,Perimeter);
					break;
				}
				case "Rectangle":
				{
					Rectangle rectangle = new Rectangle(Double.parseDouble(splitLine.nextToken()),
							Double.parseDouble(splitLine.nextToken()));
					Area = rectangle.getArea();
					Perimeter = rectangle.getPerimeter();
					output = rectangle.toString(Area,Perimeter);
					break;
				}
				case "RightTriangle":
				{
					RightTriangle triangle = new RightTriangle(Double.parseDouble(splitLine.nextToken()),
							Double.parseDouble(splitLine.nextToken()));
					Area = triangle.getArea();
					Perimeter = triangle.getPerimeter();
					output = triangle.toString(Area,Perimeter);
					break;
				}
			}
			System.out.println(output);
		}
	}

}
