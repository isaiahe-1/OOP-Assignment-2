import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ShapeList shapeList = new ShapeList();

        int choice = -1;

        while (choice != 0) {

            System.out.println("\n=== Shape Management Menu ===");
            System.out.println("1. Add a shape");
            System.out.println("2. Remove a shape by position");
            System.out.println("3. Get information about a shape by position");
            System.out.println("4. Area and perimeter of a shape by position");
            System.out.println("5. Display information of all the shapes");
            System.out.println("6. Translate all the shapes");
            System.out.println("7. Scale all the shapes");
            System.out.println("0. Quit program");
            System.out.print("Enter your choice: ");

            choice = input.nextInt();

            if (choice == 1) {
                System.out.println("\nChoose shape to add:");
                System.out.println("1. Circle");
                System.out.println("2. Square");
                System.out.println("3. Rectangle");
                System.out.println("4. Triangle");
                System.out.print("Enter shape choice: ");
                int shapeChoice = input.nextInt();

                if (shapeChoice == 1) {
                    System.out.print("Enter x coordinate: ");
                    int x = input.nextInt();
                    System.out.print("Enter y coordinate: ");
                    int y = input.nextInt();
                    System.out.print("Enter radius: ");
                    double radius = input.nextDouble();

                    Coordinates coord = new Coordinates(x, y);
                    Circle circle = new Circle(radius, coord);
                    shapeList.addShape(circle);
                    System.out.println("Circle added.");

                } else if (shapeChoice == 2) {
                    System.out.print("Enter x coordinate: ");
                    int x = input.nextInt();
                    System.out.print("Enter y coordinate: ");
                    int y = input.nextInt();
                    System.out.print("Enter side: ");
                    double side = input.nextDouble();

                    Coordinates coord = new Coordinates(x, y);
                    Square square = new Square(side, coord);
                    shapeList.addShape(square);
                    System.out.println("Square added.");

                } else if (shapeChoice == 3) {
                    System.out.print("Enter x coordinate: ");
                    int x = input.nextInt();
                    System.out.print("Enter y coordinate: ");
                    int y = input.nextInt();
                    System.out.print("Enter width: ");
                    double width = input.nextDouble();
                    System.out.print("Enter length: ");
                    double length = input.nextDouble();

                    Coordinates coord = new Coordinates(x, y);
                    Rectangle rectangle = new Rectangle(width, length, coord);
                    shapeList.addShape(rectangle);
                    System.out.println("Rectangle added.");

                } else if (shapeChoice == 4) {
                    System.out.print("Enter x for vertex A: ");
                    int x1 = input.nextInt();
                    System.out.print("Enter y for vertex A: ");
                    int y1 = input.nextInt();

                    System.out.print("Enter x for vertex B: ");
                    int x2 = input.nextInt();
                    System.out.print("Enter y for vertex B: ");
                    int y2 = input.nextInt();

                    System.out.print("Enter x for vertex C: ");
                    int x3 = input.nextInt();
                    System.out.print("Enter y for vertex C: ");
                    int y3 = input.nextInt();

                    Coordinates a = new Coordinates(x1, y1);
                    Coordinates b = new Coordinates(x2, y2);
                    Coordinates c = new Coordinates(x3, y3);

                    Triangle triangle = new Triangle(a, b, c);
                    shapeList.addShape(triangle);
                    System.out.println("Triangle added.");

                } else {
                    System.out.println("Invalid shape choice.");
                }

            } else if (choice == 2) {
                System.out.print("Enter position to remove: ");
                int pos = input.nextInt();

                Shape removedShape = shapeList.removeShape(pos);

                if (removedShape != null) {
                    System.out.println("Shape removed successfully.");
                } else {
                    System.out.println("No shape found at that position.");
                }

            } else if (choice == 3) {
                System.out.print("Enter position: ");
                int pos = input.nextInt();

                Shape shape = shapeList.getShape(pos);

                if (shape != null) {
                    System.out.println(shape.display());
                } else {
                    System.out.println("No shape found at that position.");
                }

            } else if (choice == 4) {
                System.out.print("Enter position: ");
                int pos = input.nextInt();

                Shape shape = shapeList.getShape(pos);

                if (shape != null) {
                    System.out.println("Area: " + shapeList.area(pos));
                    System.out.println("Perimeter: " + shapeList.perimeter(pos));
                } else {
                    System.out.println("No shape found at that position.");
                }

            } else if (choice == 5) {
                System.out.println(shapeList.display());

            } else if (choice == 6) {
                System.out.print("Enter x distance: ");
                int dx = input.nextInt();
                System.out.print("Enter y distance: ");
                int dy = input.nextInt();

                shapeList.translateShapes(dx, dy);
                System.out.println("All shapes translated.");

            } else if (choice == 7) {

                double factor;

                while (true) {
                    System.out.print("Enter scale factor: ");

                    if (input.hasNextDouble()) {
                        factor = input.nextDouble();

                        if (factor > 0) {
                            break;
                        } else {
                            System.out.println("Factor must be greater than 0.");
                        }
                    } else {
                        System.out.println("Invalid input. Enter a number.");
                        input.next();
                    }
                }

                String choiceText;
                boolean sign;

                while (true) {
                    System.out.print("Enter multiply or divide: ");
                    choiceText = input.next().toLowerCase();

                    if (choiceText.equals("multiply")) {
                        sign = true;
                        break;
                    } else if (choiceText.equals("divide")) {
                        sign = false;
                        break;
                    } else {
                        System.out.println("Invalid input. Please enter Multiply or Divide.");
                    }
                }

                shapeList.scale(factor, sign);
                System.out.println("All shapes scaled.");

            } else if (choice == 0) {
                System.out.println("Program ended.");

            } else {
                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}