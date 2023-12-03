package TaskSet1.ParallelNumberSummation;

public class SummationDemo {
    public static void main(String[] args) {
        final int totalNumbers = 100;
        final int threadCount = 10;

        int segmentSize = totalNumbers / threadCount;
        Thread[] threads = new Thread[threadCount];
        SummationTask[] tasks = new SummationTask[threadCount];

        for (int i = 0; i < threadCount; i++) {
            int start = i * segmentSize + 1;
            int end = (i + 1) * segmentSize;
            tasks[i] = new SummationTask(start, end);
            threads[i] = new Thread(tasks[i]);
            threads[i].start();
        }

        long totalSum = 0;
        try {
            for (int i = 0; i < threadCount; i++) {
                threads[i].join();
                totalSum += tasks[i].getSum();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Total sum: " + totalSum);
    }
}
