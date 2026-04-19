public class Circle extends Shape {

    // Variables
    private double radius;

    // Constructor
    public Circle(double radius, Coordinates coord) {
        super(0, coord);
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Get Area
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Get Perimeter (Circumference)
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Move position
    public void translate(int dx, int dy) {
        position.translate(dx, dy);
    }


    public void scale(double factor, boolean sign) {
        if (sign) {
            radius = radius * factor;
        } else {
            radius = radius / factor;
        }
    }

    // Display details
    public String display() {
        return "Circle | Radius: " + radius +
                " | Area: " + getArea() +
                " | Perimeter: " + getPerimeter();
    }
}