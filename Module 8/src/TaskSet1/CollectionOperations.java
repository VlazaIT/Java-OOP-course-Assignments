package TaskSet1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionOperations {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 8, 20, 15, 3, 12);

        // Filter Even Numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        // Double the Odd Numbers
        List<Integer> doubledOdds = numbers.stream()
                .map(n -> n % 2 != 0 ? n * 2 : n)
                .collect(Collectors.toList());

        // Sum the Numbers
        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        // Print results
        System.out.println("Even Numbers: " + evenNumbers);
        System.out.println("Doubled Odds: " + doubledOdds);
        System.out.println("Sum: " + sum);
    }
}

