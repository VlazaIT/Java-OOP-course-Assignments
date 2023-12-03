package TaskSet1;

class OddNumberPrinter implements Runnable {
    private final int max;

    OddNumberPrinter(int max) {
        this.max = max;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        for (int i = 1; i <= max; i += 2) {
            System.out.println("Odd Thread: " + i);
        }
    }
}