package TaskSet1.ParallelNumberSummation;

public class SummationTask implements Runnable {
    private final int start;
    private final int end;
    private long sum;

    SummationTask(int start, int end) {
        this.start = start;
        this.end = end;
        this.sum = 0;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }

    public long getSum() {
        return sum;
    }
}
