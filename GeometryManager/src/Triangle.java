public class Triangle extends Shape {

    // Variables
    private Coordinates vertexA;
    private Coordinates vertexB;
    private Coordinates vertexC;

    // Constructor
    public Triangle() {
        super(3, new Coordinates(0, 0));
        vertexA = new Coordinates(0, 0);
        vertexB = new Coordinates(1, 0);
        vertexC = new Coordinates(0, 1);
    }

    // Constructor with values
    public Triangle(Coordinates a, Coordinates b, Coordinates c) {
        super(3, a);
        vertexA = a;
        vertexB = b;
        vertexC = c;
    }

    // Heron's Formula
    public double getArea() {
        double a = vertexA.distance(vertexB);
        double b = vertexB.distance(vertexC);
        double c = vertexC.distance(vertexA);

        double s = (a + b + c) / 2.0;

        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Get Perimeter
    public double getPerimeter() {
        double a = vertexA.distance(vertexB);
        double b = vertexB.distance(vertexC);
        double c = vertexC.distance(vertexA);

        return a + b + c;
    }

    // Move triangle
    public void translate(int dx, int dy) {
        vertexA.translate(dx, dy);
        vertexB.translate(dx, dy);
        vertexC.translate(dx, dy);
    }

    // Scale triangle
    public void scale(double factor, boolean sign) {
        vertexA.scale(factor, sign);
        vertexB.scale(factor, sign);
        vertexC.scale(factor, sign);
    }

    // Display details
    public String display() {
        return "Triangle | A: " + vertexA.display() +
                " B: " + vertexB.display() +
                " C: " + vertexC.display() +
                " | Area: " + getArea() +
                " | Perimeter: " + getPerimeter();
    }
}