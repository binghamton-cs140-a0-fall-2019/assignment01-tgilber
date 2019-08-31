package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class USAddressTester {
	
	
	
	public static void main(String[] args){
	
	StreetUSAddress ad1 = new StreetUSAddress("Sit Road","Ap#867","Azusa","New York","39531");
	StreetUSAddress ad2 = new StreetUSAddress("Fusce Road","P.O. Box 283","Frederick","Nebraska","20620");

	System.out.print(ad1);
	System.out.printf("%n");
	System.out.print(ad2);


	
	

	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true ))) {
			output.printf("%n");
			output.println("\nTESTS FOR USAddressTester.java:");
			output.println(ad1);
			output.print("%n");
			output.print(ad2);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	
	
	
	}
		

}


