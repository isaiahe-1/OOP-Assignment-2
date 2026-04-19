public abstract class Shape {

    // Variables
    protected Coordinates position;
    protected int sides;

    // Constructor
    public Shape(int noOfSides, Coordinates coord) {
        sides = noOfSides;
        position = coord;
    }

    // Getter for coordinates
    public Coordinates getCoordinates() {
        return position;
    }

    // Getter for number of sides
    public int getSides() {
        return sides;
    }

    // Setter for coordinates
    public void setCoordinates(Coordinates newcoord) {
        position = newcoord;
    }

    // Move shape
    public void translate(int dx, int dy) {
        position.translate(dx, dy);
    }

    // Abstract methods
    public abstract void scale(int factor, boolean sign);

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String display();
}