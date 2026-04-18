public class Square {
    // Square class that extends Shape
    public class Square extends Shape {

        // Variable to store side length
        private double side;

        // Constructor
        public Square(double s, Coordinates coord) {
            super(4, coord);
            side = s;
        }

        // To calculate area
        public double getArea() {
            return side * side;
        }

        // To calculate perimeter
        public double getPerimeter() {
            return 4 * side;
        }

        // to move square
        public void translate(int dx, int dy) {
            position.translate(dx, dy);
        }

        // scale square
        public void scale(int factor, int sign, boolean both) {
            side = side * factor;

            if (both) {
                position.scale(factor, sign, both);
            }
        }

        // Display
        public String display() {
            return "Square at " + position.display() + " side: " + side;
        }
    }
}
