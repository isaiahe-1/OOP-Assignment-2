import java.util.ArrayList;

public class ShapeList {

    // List to store shapes
    private ArrayList<Shape> listOfShapes;

    // Constructor
    public ShapeList() {
        listOfShapes = new ArrayList<Shape>();
    }

    // Method to add shape
    public void addShape(Shape s) {
        listOfShapes.add(s);
    }

    // Method to get shape by position
    public Shape getShape(int pos) {
        if (pos >= 0 && pos < listOfShapes.size()) {
            return listOfShapes.get(pos);
        } else {
            return null;
        }
    }

    // Method to remove shape
    public Shape removeShape(int pos) {
        if (pos >= 0 && pos < listOfShapes.size()) {
            return listOfShapes.remove(pos);
        } else {
            return null;
        }
    }

    // Get area
    public double area(int pos) {
        if (pos >= 0 && pos < listOfShapes.size()) {
            return listOfShapes.get(pos).getArea();
        } else {
            return 0;
        }
    }

    // Get perimeter
    public double perimeter(int pos) {
        if (pos >= 0 && pos < listOfShapes.size()) {
            return listOfShapes.get(pos).getPerimeter();
        } else {
            return 0;
        }
    }

    // Translate all shapes
    public void translateShapes(int dx, int dy) {
        for (int i = 0; i < listOfShapes.size(); i++) {
            listOfShapes.get(i).translate(dx, dy);
        }
    }

    // Scale all shapes
    public void scale(double factor, boolean sign) {
        for (int i = 0; i < listOfShapes.size(); i++) {
            listOfShapes.get(i).scale(factor, sign);
        }
    }

    // Get number of shapes
    public int getNumberOfShapes() {
        return listOfShapes.size();
    }

    // Display all shapes
    public String display() {

        if (listOfShapes.size() == 0) {
            return "No shapes available.";
        }

        String output = "";

        for (int i = 0; i < listOfShapes.size(); i++) {
            output = output + "Position " + i + ": "
                    + listOfShapes.get(i).display() + "\n";
        }

        return output;
    }
}