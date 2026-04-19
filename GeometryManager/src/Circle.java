public class Circle extends Shape {

    // Variable
    private double radius;

    // Constructors
    public Circle() {
        super(0, new Coordinates(0, 0)); // circle has 0 sides
        this.radius = 1;
    }

    public Circle(double r, Coordinates coord) {
        super(0, coord);
        this.radius = r;
    }

    // Getter and Setter
    public double getRadius() {
        return radius;
    }

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

    // Scale size
    public void scale(int factor, boolean sign) {
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