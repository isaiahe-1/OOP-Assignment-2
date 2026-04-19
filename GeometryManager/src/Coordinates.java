public class Coordinates {

    // Variables
    private int x;
    private int y;

    // Constructor
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
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Move coordinates
    public void translate(int dx, int dy) {
        x = x + dx;
        y = y + dy;
    }

    // Scale coordinates (fixed to match UML)
    public void scale(int factor, boolean sign) {

        if (sign) {
            x = x * factor;
            y = y * factor;
        } else {
            x = x / factor;
            y = y / factor;
        }
    }

    // Display
    public String display() {
        return "(" + x + ", " + y + ")";
    }
}
