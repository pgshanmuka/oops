package oops;

import java.util.ArrayList;
import java.util.List;

public class Mainrectangle {
	public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4.0, 2.0);
        Rectangle rect2 = new Rectangle(3.0, 6.0);
        Rectangle rect3 = new Rectangle(2.5, 4.5);
        Rectangle rect4 = new Rectangle(5.0, 3.0);
        Rectangle rect5 = new Rectangle(3.5, 5.5);

        List<Rectangle> rectangles = new ArrayList<>();
        rectangles.add(rect1);
        rectangles.add(rect2);
        rectangles.add(rect3);
        rectangles.add(rect4);
        rectangles.add(rect5);

        Rectangle largestRectangle = rectangles.get(0);
        double largestArea = rectangles.get(0).calculateArea();

        for(Rectangle rect : rectangles) {
            if(rect.calculateArea() > largestArea) {
                largestRectangle = rect;
                largestArea = rect.calculateArea();
            }
        }

        System.out.println("The largest rectangle has length: " + largestRectangle.length + ", breadth: " + largestRectangle.breadth + ", area: " + largestArea + ", and perimeter: " + largestRectangle.calculatePerimeter());
    }
}

