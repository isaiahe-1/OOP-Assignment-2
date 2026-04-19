public class Triangle extends Shape {

    // Variables
    private Coordinates vertexA;
    private Coordinates vertexB;
    private Coordinates vertexC;

    // Default constructor
    public Triangle() {
        super(3, new Coordinates(0, 0)); // triangle = 3 sides

        vertexA = new Coordinates(0, 0);
        vertexB = new Coordinates(1, 0);
        vertexC = new Coordinates(0, 1);
    }

    // Constructor with values
    public Triangle(Coordinates a, Coordinates b, Coordinates c) {
        super(3, a); // use A as position
        this.vertexA = a;
        this.vertexB = b;
        this.vertexC = c;
    }

    // Get Area (simple formula)
    public double getArea() {
        double x1 = vertexA.getX();
        double y1 = vertexA.getY();

        double x2 = vertexB.getX();
        double y2 = vertexB.getY();

        double x3 = vertexC.getX();
        double y3 = vertexC.getY();

        return Math.abs((x1*(y2 - y3) + x2*(y3 - y1) + x3*(y1 - y2)) / 2.0);
    }

    // Get Perimeter
    public double getPerimeter() {
        double side1 = vertexA.distance(vertexB);
        double side2 = vertexB.distance(vertexC);
        double side3 = vertexC.distance(vertexA);

        return side1 + side2 + side3;
    }

    // Move triangle
    public void translate(int dx, int dy) {
        vertexA.translate(dx, dy);
        vertexB.translate(dx, dy);
        vertexC.translate(dx, dy);
    }

    // Scale triangle
    public void scale(int factor, boolean sign) {
        if (sign) {
            vertexA.scale(factor, true);
            vertexB.scale(factor, true);
            vertexC.scale(factor, true);
        } else {
            vertexA.scale(factor, false);
            vertexB.scale(factor, false);
            vertexC.scale(factor, false);
        }
    }

    // Display
    public String display() {
        return "Triangle | A(" + vertexA.getX() + "," + vertexA.getY() + ")" +
                " B(" + vertexB.getX() + "," + vertexB.getY() + ")" +
                " C(" + vertexC.getX() + "," + vertexC.getY() + ")" +
                " | Area: " + getArea() +
                " | Perimeter: " + getPerimeter();
    }
}
