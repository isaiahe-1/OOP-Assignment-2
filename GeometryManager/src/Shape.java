public class Shape {

    public abstract class Shape {


        protected Coordinates position;

        // Number of sides of the shape
        protected int sides;

        // Constructor
        public Shape(int noOfSides, Coordinates coord) {
            sides = noOfSides;
            position = coord;
        }

        // to get the coordinates
        public Coordinates getCoordinates() {
            return position;
        }

        //  to get number of sides
        public int getSides() {
            return sides;
        }

        //  change the coordinates
        public void setCoordinates(Coordinates newcoord) {
            position = newcoord;
        }

        // move the shape
        public void translate(int dx, int dy) {
            position.translate(dx, dy);
        }

        //  method to scale shape
        public abstract void scale(int factor, int sign, boolean both);

        //  method to get area
        public abstract double getArea();

        //  to get perimeter
        public abstract double getPerimeter();

        // Display
        public abstract String display();
    }
}
