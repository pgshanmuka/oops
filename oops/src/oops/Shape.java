package oops;

public class Shape {
	  //Declare properties
    public String type;
    public String color;

    //Constructor
    public Shape(String type, String color) {
        this.type = type;
        this.color = color;
    }

    public static void main(String[] args) {
        //Create a list of Shape objects
        java.util.List<Shape> shapes = new java.util.ArrayList<>();
        shapes.add(new Shape("triangle", "pink"));
        shapes.add(new Shape("square", "green"));
        shapes.add(new Shape("circle", " blue"));
        shapes.add(new Shape("triangle", "orange"));
        shapes.add(new Shape("square", "yellow"));

        //Create a map to store the count of shapes of each type
        java.util.Map<String, Integer> shapeCounts = new java.util.HashMap<>();

        //Iterate through the list and count the types of shapes
        for (Shape shape : shapes) {
            //Get the current count of that type
            Integer count = shapeCounts.get(shape.type);
            //If the type is not in the map, the count will be null, set it to 0
            if (count == null) {
                count = 0;
            }
            //Increment the count and store it in the map
            shapeCounts.put(shape.type, count + 1);
        }

        //Print the count of shapes of each type
        for (String type : shapeCounts.keySet()) {
            Integer count = shapeCounts.get(type);
            System.out.println("Type: " + type + ", Count: " + count);
        }
    }
}
	


