Task 2.

# Calculator Class

The `Calculator` class is designed for basic addition of positive numbers. It includes three main functions:

- **Adding Numbers**: Adds positive integers to the sum. Throws an `IllegalArgumentException` for negative numbers.
- **Resetting the Sum**: Resets the sum to zero.
- **Getting the Current Total**: Returns the current sum.

```java

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

```

# Calculator Class Explanation

**Copilot Version Explanation:**
The `Calculator` class manages a sum of numbers. It initializes the sum to zero. The `reset()` method resets this sum to zero, while the `add(int x)` method increments the sum by a given number, throwing an `IllegalArgumentException` for negative inputs. The `getSum()` method retrieves the current sum. The main method demonstrates using these functionalities, including handling exceptions for negative inputs.

**Updated Version Explanation:**
The `Calculator` class is streamlined for basic arithmetic. It tracks a cumulative sum, which is initially zero and can be reset anytime. Adding numbers is straightforward, but adding a negative number triggers an `IllegalArgumentException` as a safety feature. The `getSum()` method lets you view the current total. The class's main method showcases these capabilities, illustrating both regular use and exception handling.
