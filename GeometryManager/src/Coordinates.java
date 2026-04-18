public class Coordinates {
    public class Coordinates {

        // Variables to store x and y values
        private int x;
        private int y;

        // Constructor to set coordinates
        public Coordinates(int xint, int yint) {
            x = xint;
            y = yint;
        }

        // Getter for X
        public int getX() {
            return x;
        }

        // Getter for Y
        public int getY() {
            return y;
        }

        // Calculate distance
        public double distance(Coordinates p) {
            int dx = x - p.getX();
            int dy = y - p.getY();
            return Math.sqrt(dx * dx + dy * dy); // distance formula
        }

        // To move the point
        public void translate(int dx, int dy) {
            x = x + dx;
            y = y + dy;
        }

        // To scale the point
        public void scale(int factor, int sign, boolean both) {

            // If both is true, scale both x and y
            if (both) {
                x = x * factor * sign;
                y = y * factor * sign;
            }
            // Otherwise only scale x
            else {
                x = x * factor * sign;
            }
        }

        //  Display coordinates as string
        public String display() {
            return "(" + x + ", " + y + ")";
        }
    }
}
