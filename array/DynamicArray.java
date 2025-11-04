package array;

public class DynamicArray {
    private int[] array;
    private int count;


    public DynamicArray(int size) {
        array = new int[size];
    }

    public void insert(int item) {

        if (array.length == count) {
            int[] newArray = new int[count * 2];
            for (int i = 0; i < count; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[count++] = item;
    }

    public void remove(int index) {
        if (index < 0 || index >= count)
            throw new IllegalArgumentException();
        if (index == count - 1) {
            count--;
            return;
        }
        for (int i = index; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        count--;

    }

    public int indexOf(int item) {
        for (int i = 0; i < count; i++) {
            if (item == array[i])
                return i;
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
