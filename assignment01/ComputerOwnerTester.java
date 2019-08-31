package assignment01;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ComputerOwnerTester{
	
	
	public static void main(String[] args){
	
	DateAndPlaceOfBirth DPOB2 = new DateAndPlaceOfBirth(1999,04,13,"Brooklyn" ,"New York" ,"USA");
	StreetUSAddress SUSA2 = new StreetUSAddress ("Place1","Place2","Albany","New York","23456");
	Computer Computer1 = new Computer("Dell","8700k",16,2000,true,4000.00);
	Computer Computer2 = new Computer("Samsung","6700k",8,800,false,1500.00);
    Computer Computer3 = new Computer("Acer","7700k",16,1500,true,3000.00);
    Computer Computer4 = new Computer("Lenovo","6700k",8,600,false,1000.00);
	Person Moen = new Person("Moen","Aziz","234-56-7890", DPOB2, SUSA2);
	
	
	ComputerOwner owner1 = new ComputerOwner(Moen);
	
	owner1.addComputer(Computer1);
	owner1.addComputer(Computer2);
	owner1.addComputer(Computer3);
	owner1.addComputer(Computer4);
	
	System.out.println(owner1);
	
	owner1.removeComputer(1);
	owner1.removeComputer(2);
	
	System.out.printf("%n");
	System.out.println(owner1);
	

	
	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true ))) {
			output.printf("%n");
			output.print("Tests for ComputerOwnerTester.java:%n");
			output.println(owner1);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	
	
	
	}
	
	
}