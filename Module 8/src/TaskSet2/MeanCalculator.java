package TaskSet2;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class MeanCalculator {
    public static void main(String[] args) {
        int[] numbers = {15, 20, 30, 40, 55};

        IntSummaryStatistics stats = Arrays.stream(numbers).summaryStatistics();
        double mean = stats.getAverage();

        System.out.println("Mean: " + mean);
    }
}

