package chapter6;

import org.w3c.dom.css.Rect;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth () {
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePermeter() {
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return length * width;
    }
}
