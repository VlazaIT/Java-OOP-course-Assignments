package TaskSet1;

// Task 3

public class Circle extends Shape{
    private double radius;
    public Circle (double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }
}
