package chapter6;

public class HomeAreaCalculator {

    public static void main(String args[]) {

        /*
            Rectangle 1
         */

        // Create an instance of rectangle class
        Rectangle room1 = new Rectangle();
        room1.setLength(25);
        room1.setWidth(50);
        double areaOfRoom1 = room1.calculateArea();

         /*
            Rectangle 2
         */

         // Create another instance of Rectangle Class
        Rectangle room2 = new Rectangle(30, 35);
        double areaofRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaofRoom2;

        System.out.println("Area of both rooms: " + totalArea);
    }
}
