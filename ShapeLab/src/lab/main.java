package lab;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class main {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File file = new File("data");
		Scanner shapeFile = new Scanner(file);
		
		
		while(shapeFile.hasNext())
		{
			String input = shapeFile.nextLine();
			StringTokenizer lineSplit = new StringTokenizer(input);
			
			
		}
	}

}
