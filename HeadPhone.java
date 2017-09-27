/*
 * File: HeadPhone.java
 * Author: Yael Brown
 * Date: September 12, 2017
 * Purpose: Crate a Java program that creates a class and tests
 * getters and setters for that constructed class.
 */

 // Import required java libraries

 /**
  * HeadPhone Class
  * 
  */
public class HeadPhone {
    // Declare constants to denote headphone volume
    private int LOW = 1;
    private int MEDIUM = 2;
    private int HIGH = 3;

    // Declare variables to hold values
    private int volume = MEDIUM; 
    private boolean pluggedIn = false;
    private String manufacturer = null;
    private String headPhoneColor = null;
    private String headPhoneModel = null;

    // Constructor for Headphones
    public HeadPhone (
            int vol,
            boolean plugged,
            String manf,
            String color,
            String model) {
        volume = vol;
        pluggedIn = plugged;
        manufacturer = manf;
        headPhoneColor = color;
        headPhoneModel = model;
    }

    // Default constructor with default values
    public HeadPhone(){
        int volume = MEDIUM;
        boolean pluggedIn = false;
        String manufacturer = null;
        String headPhoneColor = null;
        String headPhoneModel = null;
    }

    // Setter methods for all data fields
    public void setVolume(int vol) { // Sets volume and validates its either LOW, MEDIUM, or HIGH
        if (vol == LOW || vol == MEDIUM || vol == HIGH) {
            vol = volume;
        } 
    }

    public void setPluggedIn(boolean plugged) {
        plugged = pluggedIn;
    }

    public void setManufacturer(String manf) {
        manf = manufacturer;
    }

    public void setHPColor(String color) {
        color = headPhoneColor;
    }

    public void setHPModel(String model) {
        model = headPhoneModel;
    }

    // Getter methods for all data fields
    public int getVolume() {
        return volume;
    }

    public boolean getPluggedIn() {
        return pluggedIn;
    }

    public String getManfacturer() {
        return manufacturer;
    }

    public String getHPColor() {
        return headPhoneColor;
    }

    public String getHPModel() {
        return headPhoneModel;
    }

    //toString method. 
    public String toString() {
    	String str = "The " + getHPColor() +
    			" " + getManfacturer() +
    			" " + getHPModel() +
    			" is plugged in: " + getPluggedIn() +
    			". Volume is set to " + getVolume();
    	return str; 
    }
}
