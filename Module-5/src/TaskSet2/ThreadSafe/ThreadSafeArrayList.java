package TaskSet2.ThreadSafe;

import java.util.ArrayList;

public class ThreadSafeArrayList {
    private final ArrayList<Object> list = new ArrayList<>();

    public synchronized void add(Object element) {
        list.add(element);
    }

    public synchronized int size() {
        return list.size();
    }

    public synchronized void remove(int index) {
        if (index >= 0 && index < list.size()) {
            list.remove(index);
        }
    }
}