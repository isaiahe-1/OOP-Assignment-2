public class Rectangle {
    // Rectangle class that extends Shape
    public class Rectangle extends Shape {

        // Variables to store width and length
        private double width;
        private double length;

        // Constructor
        public Rectangle(double w, double l, Coordinates coord) {
            super(4, coord);
            width = w;
            length = l;
        }

        // To calculate area
        public double getArea() {
            return width * length;
        }

        // To calculate perimeter
        public double getPerimeter() {
            return 2 * (width + length);
        }

        //To move rectangle
        public void translate(int dx, int dy) {
            position.translate(dx, dy);
        }

        // To scale rectangle
        public void scale(int factor, int sign, boolean both) {
            width = width * factor;
            length = length * factor;

            if (both) {
                position.scale(factor, sign, both);
            }
        }

        // Display
        public String display() {
            return "Rectangle at " + position.display() +
                    " width: " + width +
                    " length: " + length;
        }
    }
}
