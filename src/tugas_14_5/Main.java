package tugas_14_5;

public class Main {
    public static void main(String[] args) {
        //Test Triangle
        Triangle t1 = new Triangle(1, 1.5, 1);
        Triangle t2 = new Triangle(1, 1, 1);
        System.out.println("Triangle 1: " + t1.toString());
        System.out.println("Triangle 2: " + t2.toString());
        System.out.println("The area of Triangle 1 is " + t1.getArea());
        System.out.println("The area of Triangle 2 is " + t2.getArea());
        System.out.println("The perimeter of Triangle 1 is " + t1.getPerimeter());
        System.out.println("The perimeter of Triangle 2 is " + t2.getPerimeter());
    }
    
}

class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;
    public GeometricObject() {
        dateCreated = new java.util.Date();
    }
    public GeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public java.util.Date getDateCreated() {
        return dateCreated;
    }
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }
}

class Triangle extends GeometricObject {
    double side1, side2, side3;
    public Triangle() {

    }
    public Triangle(double side1, double side2, double side3) {
        if (side1 + side2 <= side3 || side1 + side3 <= side2 || side2 + side3 <= side1)
            throw new IllegalArgumentException("Invalid input. The sum of any two sides must be greater than the third side.");
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    public String toString() {
        return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
    } 
}
