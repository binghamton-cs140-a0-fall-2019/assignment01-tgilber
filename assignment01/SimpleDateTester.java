package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class SimpleDateTester{
	
	
	
	public static void main(String[] args){
			
			SimpleDate day1 = SimpleDate.of(2001,8,27);
			SimpleDate day2 = SimpleDate.of(2003,7,12);
			
			System.out.println("Expected result: true");
		
			System.out.println(day1.before(day2));
			
			SimpleDate day3 = SimpleDate.of(2000,4,13);
			SimpleDate day4 = SimpleDate.of(1998,2,12);
			
			System.out.println("Expected result: false");
			
			System.out.println(day3.before(day4));
	
			/**
			try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true  true means append to file ))) {
			output.printf("%n");
			output.println("\nTESTS FOR SimpleDateTester.java:");
			
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  
		*/
	
	}
	
}