/*
 * File: TestHeadPhone.java
 * Author: Yael Brown
 * Date: September 12, 2017
 * Purpose: This class constructs 3 headphone objects. 
 */

  /**
  * TestHeadPhone Class
  * 
  */
public class TestHeadPhone {
	private static String string;

	public static void main(String[] args) {
		// Create 3 headphones
		HeadPhone hp1 = new HeadPhone(1, false, "Sennheiser", "Black", "HD-555");
		HeadPhone hp2 = new HeadPhone(2, true, "Sony", "Black", "MD-515");
		HeadPhone hp3 = new HeadPhone(3, false, "Corsair", "Black", "HyperX");
		
  	
		// ToString method
		System.out.println(hp1.toString());
		System.out.println(hp2.toString());
		System.out.println(hp3.toString());
	}
}
