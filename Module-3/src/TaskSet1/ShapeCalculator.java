package TaskSet1;

// Task 3 & 4

public class ShapeCalculator {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(4.0, 6.0);
        shapes[2] = new Triangle(3.0, 8.0);
        shapes[3] = new Circle(7.0);  // Additional circle for demonstration of the Task 4

        System.out.println("Task 3: Shape Calculator\n");

        for (Shape shape : shapes) {
            System.out.println("Area of " + shape.getName() + ": " + shape.calculateArea());
        }

        System.out.println("Task 4: Shape Compatibility\n");

        for (int i = 0; i < shapes.length; i++) {
            for (int j = i + 1; j < shapes.length; j++) {
                boolean compatible = areShapesCompatible(shapes[i], shapes[j]);
                System.out.println(shapes[i].getName() + i + " and " + shapes[j].getName() + j + " are compatible: " + compatible);
            }
        }
    }

    public static boolean areShapesCompatible(Shape shape1, Shape shape2) {
        return shape1 != null && shape2 != null && shape1.getName().equals(shape2.getName());
    }

}

