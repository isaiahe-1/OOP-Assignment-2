public class Main {

    public static void main(String[] args) {

        // Create a ShapeList object
        ShapeList shapeList = new ShapeList();

        // Create Coordinates for each shape
        Coordinates coord1 = new Coordinates(1, 2);
        Coordinates coord2 = new Coordinates(3, 4);
        Coordinates coord3 = new Coordinates(5, 6);

        // Create Coordinates for triangle
        Coordinates a = new Coordinates(0, 0);
        Coordinates b = new Coordinates(4, 0);
        Coordinates c = new Coordinates(0, 3);

        // Create shapes
        Circle c1 = new Circle(4.5, coord1);
        Square s1 = new Square(5, coord2);
        Rectangle r1 = new Rectangle(6, 3, coord3);
        Triangle t1 = new Triangle(a, b, c);

        // Add shapes into ShapeList
        shapeList.addShape(c1);
        shapeList.addShape(s1);
        shapeList.addShape(r1);
        shapeList.addShape(t1);

        // Display all shapes
        System.out.println("=== Shape Details ===");
        System.out.println(c1.display());
        System.out.println(s1.display());
        System.out.println(r1.display());
        System.out.println(t1.display());

        // Show area and perimeter using ShapeList
        System.out.println("\n=== Area and Perimeter ===");
        System.out.println("Circle area: " + shapeList.area(0));
        System.out.println("Circle perimeter: " + shapeList.perimeter(0));

        System.out.println("Square area: " + shapeList.area(1));
        System.out.println("Square perimeter: " + shapeList.perimeter(1));

        System.out.println("Rectangle area: " + shapeList.area(2));
        System.out.println("Rectangle perimeter: " + shapeList.perimeter(2));

        System.out.println("Triangle area: " + shapeList.area(3));
        System.out.println("Triangle perimeter: " + shapeList.perimeter(3));

        // Translate all shapes
        shapeList.translateShapes(2, 3);

        System.out.println("\n=== After Translating Shapes ===");
        System.out.println(c1.display());
        System.out.println(s1.display());
        System.out.println(r1.display());
        System.out.println(t1.display());

        // Scale one shape
        shapeList.scale(2, 2, true); // scale rectangle at position 2

        System.out.println("\n=== After Scaling Rectangle ===");
        System.out.println(r1.display());
    }
}