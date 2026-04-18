public class Triangle {
    // Triangle class that extends Shape
    public class Triangle extends Shape {

        // Variables for 3 vertices
        private Coordinates vertexA;
        private Coordinates vertexB;
        private Coordinates vertexC;

        // Constructor
        public Triangle(Coordinates a, Coordinates b, Coordinates c) {
            super(3, a);
            vertexA = a;
            vertexB = b;
            vertexC = c;
        }

        // To calculate area
        public double getArea() {
            double x1 = vertexA.getX();
            double y1 = vertexA.getY();
            double x2 = vertexB.getX();
            double y2 = vertexB.getY();
            double x3 = vertexC.getX();
            double y3 = vertexC.getY();

            return Math.abs((x1 * (y2 - y3)
                    + x2 * (y3 - y1)
                    + x3 * (y1 - y2)) / 2.0);
        }

        // To calculate perimeter
        public double getPerimeter() {
            double s1 = vertexA.distance(vertexB);
            double s2 = vertexB.distance(vertexC);
            double s3 = vertexC.distance(vertexA);

            return s1 + s2 + s3;
        }

        // To move triangle
        public void translate(int dx, int dy) {
            vertexA.translate(dx, dy);
            vertexB.translate(dx, dy);
            vertexC.translate(dx, dy);
            position = vertexA;
        }

        //  Scale triangle
        public void scale(int factor, int sign, boolean both) {
            vertexA.scale(factor, sign, both);
            vertexB.scale(factor, sign, both);
            vertexC.scale(factor, sign, both);
            position = vertexA;
        }

        // Display
        public String display() {
            return "Triangle: " +
                    vertexA.display() + ", " +
                    vertexB.display() + ", " +
                    vertexC.display();
        }
    }
}
