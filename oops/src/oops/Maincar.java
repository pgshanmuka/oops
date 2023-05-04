package oops;

public class Maincar {
	 public static void main(String[] args) {
	     // Create a list of 5 car objects
	     Car car1 = new Car("Toyota", "Camry", 2007);
	     Car car2 = new Car("Honda", "Accord", 2008);
	     Car car3 = new Car("Ford", "F-150", 2017);
	     Car car4 = new Car("Toyota", "Tacoma", 2020);
	     Car car5 = new Car("Suzuki", "Model X", 2019);
	     
	     // Display the details of the cars
	     System.out.println("Car 1 Details:");
	     System.out.println("Make: " + car1.getMake());
	     System.out.println("Model: " + car1.getModel());
	     System.out.println("Year: " + car1.getYear());
	     
	     System.out.println("\nCar 2 Details:");
	     System.out.println("Make: " + car2.getMake());
	     System.out.println("Model: " + car2.getModel());
	     System.out.println("Year: " + car2.getYear());
	     
	     System.out.println("\nCar 3 Details:");
	     System.out.println("Make: " + car3.getMake());
	     System.out.println("Model: " + car3.getModel());
	     System.out.println("Year: " + car3.getYear());
	     
	     System.out.println("\nCar 4 Details:");
	     System.out.println("Make: " + car4.getMake());
	     System.out.println("Model: " + car4.getModel());
	     System.out.println("Year: " + car4.getYear());
	     
	     System.out.println("\nCar 5 Details:");
	     System.out.println("Make: " + car5.getMake());
	     System.out.println("Model: " + car5.getModel());
	     System.out.println("Year: " + car5.getYear());
	 }
	}


