package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class DOBTester {

  public static void main(String[] args) {
  
  DateAndPlaceOfBirth DOB1 = new DateAndPlaceOfBirth(2000,07,31,"Kingston" ,"New York" ,"USA");
  DateAndPlaceOfBirth DOB2 = new DateAndPlaceOfBirth(2000,07,31,"Albany" ,"New York" , "USA");
  DateAndPlaceOfBirth DOB3 = new DateAndPlaceOfBirth(1998,07,31,"Buffalo" ,"New York" , "USA");
  DateAndPlaceOfBirth DOB4 = new DateAndPlaceOfBirth(1999,04 ,12 ,"London" ,"England");
  DateAndPlaceOfBirth DOB5 = new DateAndPlaceOfBirth(2001 ,03 ,23 ,"Warsaw" ,"Poland");
  
  
  System.out.println(DOB1);
  System.out.println(DOB2);
  System.out.println(DOB3);
  System.out.println(DOB4);
  System.out.println(DOB5);
  
  //testing other methods
  
  System.out.printf("%nolderThan series%n"); // first section
  System.out.printf("Expected values: %n:::%nfalse%nfalse%nfalse%ntrue%n:::%n");
  
  System.out.println(DOB1.olderThan(DOB2));
  System.out.println(DOB1.olderThan(DOB3));
  System.out.println(DOB1.olderThan(DOB4));
  System.out.println(DOB1.olderThan(DOB5));
  
  System.out.printf("Expected values 2: %n:::%nfalse%nfalse%nfalse%ntrue%n:::%n");  
  
  System.out.println(DOB2.olderThan(DOB1));
  System.out.println(DOB2.olderThan(DOB3));
  System.out.println(DOB2.olderThan(DOB4));
  System.out.println(DOB2.olderThan(DOB5));
  
  System.out.printf("Expected values 3: %n:::%ntrue%ntrue%ntrue%ntrue%n:::%n");  
  
  System.out.println(DOB3.olderThan(DOB2));
  System.out.println(DOB3.olderThan(DOB1));
  System.out.println(DOB3.olderThan(DOB4));
  System.out.println(DOB3.olderThan(DOB5));
  
  System.out.printf("Expected values 4: %n:::%ntrue%nfalse%ntrue%ntrue%n:::%n");  
  
  System.out.println(DOB4.olderThan(DOB2));
  System.out.println(DOB4.olderThan(DOB3));
  System.out.println(DOB4.olderThan(DOB1));
  System.out.println(DOB4.olderThan(DOB5));
  
  System.out.printf("Expected values 5: %n:::%nfalse%nfalse%nfalse%nfalse%n:::%n");
  
  System.out.println(DOB5.olderThan(DOB2));
  System.out.println(DOB5.olderThan(DOB3));
  System.out.println(DOB5.olderThan(DOB4));
  System.out.println(DOB5.olderThan(DOB1));
  
  System.out.printf("%nyoungerThan series%n"); //next section
  System.out.printf("Expected values: %n:::%nfalse%ntrue%ntrue%nfalse%n:::%n");
   
  System.out.println(DOB1.youngerThan(DOB2));
  System.out.println(DOB1.youngerThan(DOB3));
  System.out.println(DOB1.youngerThan(DOB4));
  System.out.println(DOB1.youngerThan(DOB5));
  
  System.out.printf("Expected values2: %n:::%nfalse%ntrue%ntrue%nfalse%n:::%n");
  
  System.out.println(DOB2.youngerThan(DOB1));
  System.out.println(DOB2.youngerThan(DOB3));
  System.out.println(DOB2.youngerThan(DOB4));
  System.out.println(DOB2.youngerThan(DOB5));
  
  System.out.printf("Expected values3: %n:::%nfalse%nfalse%nfalse%nfalse%n:::%n");
  
  System.out.println(DOB3.youngerThan(DOB1));
  System.out.println(DOB3.youngerThan(DOB2));
  System.out.println(DOB3.youngerThan(DOB4));
  System.out.println(DOB3.youngerThan(DOB5));
  
  System.out.printf("Expected values4: %n:::%nfalse%nfalse%ntrue%nfalse%n:::%n");
  
  System.out.println(DOB4.youngerThan(DOB1));
  System.out.println(DOB4.youngerThan(DOB2));
  System.out.println(DOB4.youngerThan(DOB3));
  System.out.println(DOB4.youngerThan(DOB5));
  
  System.out.printf("Expected values5: %n:::%ntrue%ntrue%ntrue%ntrue%n:::%n");
  
  System.out.println(DOB5.youngerThan(DOB1));
  System.out.println(DOB5.youngerThan(DOB2));
  System.out.println(DOB5.youngerThan(DOB3));
  System.out.println(DOB5.youngerThan(DOB4));
  
  System.out.println("hasSameBirthDateAs series"); //next section
  
  System.out.printf("Expected values: %n:::%ntrue%nfalse%nfalse%nfalse%n:::%n");
  
  System.out.println(DOB1.hasSameBirthDateAs(DOB2));
  System.out.println(DOB1.hasSameBirthDateAs(DOB3));
  System.out.println(DOB1.hasSameBirthDateAs(DOB4));
  System.out.println(DOB1.hasSameBirthDateAs(DOB5));
  
  System.out.printf("Expected values2: %n:::%ntrue%nfalse%nfalse%nfalse%n:::%n");
  
  System.out.println(DOB2.hasSameBirthDateAs(DOB1));
  System.out.println(DOB2.hasSameBirthDateAs(DOB3));
  System.out.println(DOB2.hasSameBirthDateAs(DOB4));
  System.out.println(DOB2.hasSameBirthDateAs(DOB5));
  
  System.out.printf("Expected values3: %n:::%nfalse%nfalse%nfalse%nfalse%n:::%n");
  
  System.out.println(DOB3.hasSameBirthDateAs(DOB1));
  System.out.println(DOB3.hasSameBirthDateAs(DOB2));
  System.out.println(DOB3.hasSameBirthDateAs(DOB4));
  System.out.println(DOB3.hasSameBirthDateAs(DOB5));
  
  System.out.printf("Expected values4: %n:::%nfalse%nfalse%nfalse%nfalse%n:::%n");
  
  System.out.println(DOB4.hasSameBirthDateAs(DOB1));
  System.out.println(DOB4.hasSameBirthDateAs(DOB2));
  System.out.println(DOB4.hasSameBirthDateAs(DOB3));
  System.out.println(DOB4.hasSameBirthDateAs(DOB5));
  
  System.out.printf("Expected values5: %n:::%nfalse%nfalse%nfalse%nfalse%n:::%n");
  
  System.out.println(DOB5.hasSameBirthDateAs(DOB1));
  System.out.println(DOB5.hasSameBirthDateAs(DOB2));
  System.out.println(DOB5.hasSameBirthDateAs(DOB3));
  System.out.println(DOB5.hasSameBirthDateAs(DOB4));
  
  System.out.println("hasSameBirthDayAs series"); //next section
  System.out.printf("Expected values: %n:::%ntrue%ntrue%nfalse%nfalse%n:::%n");
  
  System.out.println(DOB1.hasSameBirthDayAs(DOB2));
  System.out.println(DOB1.hasSameBirthDayAs(DOB3));
  System.out.println(DOB1.hasSameBirthDayAs(DOB4));
  System.out.println(DOB1.hasSameBirthDayAs(DOB5));
  
  System.out.printf("Expected values2: %n:::%ntrue%ntrue%nfalse%nfalse%n:::%n");
  
  System.out.println(DOB2.hasSameBirthDayAs(DOB1));
  System.out.println(DOB2.hasSameBirthDayAs(DOB3));
  System.out.println(DOB2.hasSameBirthDayAs(DOB4));
  System.out.println(DOB2.hasSameBirthDayAs(DOB5));
  
  System.out.printf("Expected values3: %n:::%ntrue%ntrue%nfalse%nfalse%n:::%n");
  
  System.out.println(DOB3.hasSameBirthDayAs(DOB1));
  System.out.println(DOB3.hasSameBirthDayAs(DOB2));
  System.out.println(DOB3.hasSameBirthDayAs(DOB4));
  System.out.println(DOB3.hasSameBirthDayAs(DOB5));
  
  System.out.printf("Expected values4: %n:::%nfalse%nfalse%nfalse%nfalse%n:::%n");
  
  System.out.println(DOB4.hasSameBirthDayAs(DOB1));
  System.out.println(DOB4.hasSameBirthDayAs(DOB2));
  System.out.println(DOB4.hasSameBirthDayAs(DOB3));
  System.out.println(DOB4.hasSameBirthDayAs(DOB5));
  
  System.out.printf("Expected values5: %n:::%nfalse%nfalse%nfalse%nfalse%n:::%n");
  
  System.out.println(DOB5.hasSameBirthDayAs(DOB1));
  System.out.println(DOB5.hasSameBirthDayAs(DOB2));
  System.out.println(DOB5.hasSameBirthDayAs(DOB3));
  System.out.println(DOB5.hasSameBirthDayAs(DOB4));
  
	
	
	
	
	

	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true ))) {
			output.printf("%n");
			output.println("\nTESTS FOR DOBTester.java:");
			
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
  
	
   
  
  
  
  }
  
  
}

