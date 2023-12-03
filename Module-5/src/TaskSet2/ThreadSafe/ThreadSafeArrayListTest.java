package TaskSet2.ThreadSafe;

public class ThreadSafeArrayListTest {
    public static void main(String[] args) throws InterruptedException {
        ThreadSafeArrayList list = new ThreadSafeArrayList();

        // Threads for adding elements
        Thread[] addThreads = new Thread[10];
        for (int i = 0; i < addThreads.length; i++) {
            addThreads[i] = new Thread(() -> {
                list.add("Hello");
                list.add("World");
                list.add("!");
            });
            addThreads[i].start();
        }

        // Wait for add threads to complete
        for (Thread thread : addThreads) {
            thread.join();
        }

        // Printing the size after additions
        System.out.println("Size of list after additions: " + list.size());

        // Threads for removing elements
        Thread[] removeThreads = new Thread[10];
        for (int i = 0; i < removeThreads.length; i++) {
            removeThreads[i] = new Thread(() -> {
                while (list.size() > 0) {
                    list.remove(0);
                }
            });
            removeThreads[i].start();
        }

        // Wait for remove threads to complete
        for (Thread thread : removeThreads) {
            thread.join();
        }

        // Printing the final size of the list
        System.out.println("Final size of list: " + list.size());
    }
}
