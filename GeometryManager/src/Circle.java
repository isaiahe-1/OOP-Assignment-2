public class Circle {
    // Circle class (inherits from Shape)
    public class Circle extends Shape {

        // Variable
        private double radius;

        // Default constructor
        public Circle() {
            super(0, new Coordinates(0, 0)); // this is because circle has 0 sides
            this.radius = 1;
        }

        // Constructor with radius and position
        public Circle(double r, Coordinates coord) {
            super(0, coord);
            this.radius = r;
        }

        // Getter
        public double getRadius() {
            return radius;
        }

        // Setter
        public void setRadius(double radius) {
            this.radius = radius;
        }

        // Calculate area
        public double getArea() {
            return radius * radius * Math.PI;
        }

        // Calculate perimeter
        public double getPerimeter() {
            return 2 * radius * Math.PI;
        }

        // Move circle
        public void translate(int dx, int dy) {
            position.translate(dx, dy);
        }

        // Scale circle
        public void scale(int factor, int sign, boolean both) {
            radius = radius * factor;

            if (both) {
                position.scale(factor, sign, both);
            }
        }

        // Display details
        public String display() {
            return "Circle with radius = " + radius +
                    " at position " + position.display() +
                    "\nArea: " + getArea() +
                    "\nPerimeter: " + getPerimeter();
        }
    }
}
