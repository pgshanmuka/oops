package oops;

public class Car {
	  private String make;
	    private String model;
	    private int year;
	    
	    // Constructor
	    public Car(String make, String model, int year) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	    }
	    
	    // Getters and Setters
	    public String getMake() {
	        return this.make;
	    }
	    
	    public void setMake(String make) {
	        this.make = make;
	    }
	    
	    public String getModel() {
	        return this.model;
	    }
	    
	    public void setModel(String model) {
	        this.model = model;
	    }
	    
	    public int getYear() {
	        return this.year;
	    }
	    
	    public void setYear(int year) {
	        this.year = year;
	    }
	}


