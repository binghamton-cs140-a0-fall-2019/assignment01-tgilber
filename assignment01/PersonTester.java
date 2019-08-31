package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PersonTester{
	
	
	public static void main(String[] args){
		
	DateAndPlaceOfBirth DPOB1 = new DateAndPlaceOfBirth(2000,07,31,"Kingston" ,"New York" ,"USA");
	StreetUSAddress SUSA1 = new StreetUSAddress ("Road1","Road2","Kingston","New York","12345");
	Person Tyler = new Person("Tyler","Gilbert","123-45-6789", DPOB1, SUSA1);
	
	
	System.out.println(Tyler);	
	
	
	
	
	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true ))) {
			output.printf("%n");
			output.print("Test for PersonTester.java:");
			output.println(Tyler);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}