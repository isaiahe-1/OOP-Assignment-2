public class Square extends Shape {

    // Variables
    private double side;

    // Default constructor
    public Square() {
        super(4, new Coordinates(0, 0));
        this.side = 1;
    }

    // Constructor with values
    public Square(double s, Coordinates coord) {
        super(4, coord);
        this.side = s;
    }

    // Getter
    public double getSide() {
        return side;
    }

    // Setter
    public void setSide(double side) {
        this.side = side;
    }

    // Calculate Area
    public double getArea() {
        return side * side;
    }

    // Calculate Perimeter
    public double getPerimeter() {
        return 4 * side;
    }


    public void scale(double factor, boolean sign) {
        if (sign) {
            side = side * factor;
        } else {
            side = side / factor;
        }
    }

    // Display details
    public String display() {
        return "Square | Side: " + side +
                " | Area: " + getArea() +
                " | Perimeter: " + getPerimeter();
    }
}
