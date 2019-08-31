package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class ComputerTester {

  public static void main(String[] args) {
   
  Computer comp1 = new Computer("Dell","8700k",16,2000,true,4000.00);
  Computer comp2 = new Computer("Samsung","6700k",8,800,false,1500.00);
  Computer comp3 = new Computer("Acer","7700k",16,1500,true,3000.00);
  Computer comp4 = new Computer("Lenovo","6700k",8,600,false,1000.00);
  
  System.out.println(comp1);
  System.out.println(comp2);
  System.out.println(comp3);
  System.out.println(comp4);
	
	
	
	
		try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true ))) {
			output.println("\nTESTS FOR Computer.java:");
		
		Computer comp12 = new Computer("Dell2","8700k",16,2000,true,4000.00);
		Computer comp22 = new Computer("Samsung2","6700k",8,800,false,1500.00);
		Computer comp32 = new Computer("Acer2","7700k",16,1500,true,3000.00);
		Computer comp42 = new Computer("Lenovo2","6700k",8,600,false,1000.00);
		
		output.printf("%n");
		output.println(comp12);
		output.println(comp22);
		output.println(comp32);
		output.println(comp42);
  
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}