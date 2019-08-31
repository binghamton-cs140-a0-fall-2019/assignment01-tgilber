package assignment01;
/**
 * SORRY: I did not have time for the javadocs
 * @author CS 140
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter; 
 
public class StreetUSAddress {
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String stateAbbreviation;
	private String zipCode;
  
	public StreetUSAddress(String address1, 
			String address2, String city, 
			String state, String zip) {
	  
	  addressLine1 = address1;
	  addressLine2 = address2;
	  this.city = city;
	  stateAbbreviation = state;
	  zipCode = zip;
	  
	}
	/**
	 * 
	 * @return
	 */
	public String getAddressLine1() {
		return addressLine1;
	
	}
	/**
	 * 
	 * @return
	 */
	public String getAddressLine2() {
		return addressLine2;
	
	}
	/**
	 * 
	 * @return
	 */
	public String getCity() {
		return this.city;
	
	}
	/**
	 * 
	 * @return
	 */
	public String getStateAbbreviation() {
    
		return stateAbbreviation;
	
	}
	/**
	 * 
	 * @return
	 */	
	public String getZipCode() {
    
		return zipCode;
	
	}
	
	@Override
	public String toString() {
		if(addressLine2.trim().length() > 0) {
			return String.format("%n%s,%n%s,%n%s,%s,%s", addressLine1, 
					addressLine2, city, stateAbbreviation, zipCode);
		} else {
			return String.format("%n%s\n%s, %s %s", addressLine1, 
					city, stateAbbreviation, zipCode);
		}
	}
	
	/**
	try(var output =new PrintWriter(new FileOutputStream(
			    new File("output.txt"), true ))) {
			output.println("\nTESTS FOR StreetUSAddress.java:");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		*/
}
