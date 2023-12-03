package TaskSet1;

class EvenNumberPrinter implements Runnable {
    private final int max;

    EvenNumberPrinter(int max) {
        this.max = max;
    }

    @Override
    public void run() {
        for (int i = 2; i <= max; i += 2) {
            System.out.println("Even Thread: " + i);
        }
    }
}
