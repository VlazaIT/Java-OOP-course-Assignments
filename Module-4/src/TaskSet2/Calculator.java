package TaskSet2;

// Task 1

public class Calculator {
    private int sum;
    public Calculator() {
        sum = 0;
    }

    public void reset() {
        sum = 0;
    }

    public void add(int x) throws IllegalArgumentException {
        if (x < 0) {
            throw new IllegalArgumentException("Negative number");
        }
        sum += x;
    }

    public int getSum() {
        return sum;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        try {
            c.add(5);
            c.add(10);

            System.out.println("Sum: " + c.getSum());

            c.reset();
            System.out.println("After reset: " + c.getSum());

            c.add(-5);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
