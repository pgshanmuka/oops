package oops;

public class Animal {
	
	private String name;
	private String type;
	
	public Animal(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	public boolean isDomestic() {
		return type.equals("domestic");
	}
	
	public String getName() {
		return name;
	}
	
	public static void main(String[] args) {
		Animal ani1 = new Animal("Dog", "domestic");
		Animal ani2 = new Animal("Cat", "domestic");
		Animal ani3 = new Animal("Lion", "wild");
		Animal ani4 = new Animal("Elephant", "wild");
		Animal ani5 = new Animal("Sheep", "domestic");
		
		System.out.println("Domestic Animals:");
		
		if(ani1.isDomestic()){
			System.out.println(ani1.getName());
		}
		if(ani2.isDomestic()){
			System.out.println(ani2.getName());
		}
		if(ani3.isDomestic()){
			System.out.println(ani3.getName());
		}
		if(ani4.isDomestic()){
			System.out.println(ani4.getName());
		}
		if(ani5.isDomestic()){
			System.out.println(ani5.getName());
		}
	}
}


