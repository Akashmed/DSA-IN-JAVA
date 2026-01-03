package Queue;

import javax.swing.*;
import java.util.Arrays;

public class PriorityQueue {
    private final int[] items = new int[5];
    private int count;

    public void insert(int item) {
        if (count == items.length)
            throw new IllegalStateException();

        int i;
        for (i = count - 1; i >= 0; i--) {
            if (items[i] > item) {
                items[i + 1] = items[i];
            } else {
                break;
            }
        }

        items[i + 1] = item;
        count++;
    }

    public int remove() {
        if (isEmpty())
            throw new IllegalStateException();

        return items[--count];
    }

    public boolean isEmpty() {
        return count == 0;
    }


    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}

// 2 5 7 0 0
//
