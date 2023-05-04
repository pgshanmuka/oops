package oops;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public double getTotalCost(){
		return price * quantity;
	}
	
	public static void main(String[] args) {
		Product p1 = new Product("Slippers", 250.00, 1);
		Product p2 = new Product("T-Shirt", 200.00, 2);
		Product p3 = new Product("frock", 300.00, 3);
		Product p4 = new Product("Jean", 500.00, 4);
		Product p5 = new Product("Gloves", 300.00, 5);
		
		double totalCost = p1.getTotalCost() + p2.getTotalCost() + p3.getTotalCost() + p4.getTotalCost() + p5.getTotalCost();
		
		System.out.println("Total cost of Shopping Cart: $" + totalCost);
	}
}

