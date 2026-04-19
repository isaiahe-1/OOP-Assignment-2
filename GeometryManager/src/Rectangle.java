public class Rectangle extends Shape {

    // Variables
    private double width;
    private double length;

    // Constructors
    public Rectangle() {
        super(4, new Coordinates(0, 0)); // rectangle has 4 sides
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(double width, double length, Coordinates coord) {
        super(4, coord);
        this.width = width;
        this.length = length;
    }

    // Getters
    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    // Setters
    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    // Get Area
    public double getArea() {
        return width * length;
    }

    // Get Perimeter
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Move position
    public void translate(int dx, int dy) {
        position.translate(dx, dy);
    }

    // Scale size
    public void scale(int factor, boolean sign) {
        if (sign) {
            width = width * factor;
            length = length * factor;
        } else {
            width = width / factor;
            length = length / factor;
        }
    }

    // Display details
    public String display() {
        return "Rectangle | Width: " + width +
                " | Length: " + length +
                " | Area: " + getArea() +
                " | Perimeter: " + getPerimeter();
    }
}
