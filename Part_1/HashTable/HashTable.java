package Part_1.HashTable;

import java.util.LinkedList;

public class HashTable {
    private class Entry {
        private int key;
        private String value;

        private Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        var index = hast(key);
        if (entries[index] == null)
            entries[index] = new LinkedList<>();

        var bucket = entries[index];
        for (var entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }
        bucket.addLast(new Entry(key, value));
    }

    private int hast(int key) {
        return key % entries.length;
    }

    public String get(int key) {
        var index = hast(key);
        var bucket = entries[index];

        if (bucket != null) {
            for (var entry : bucket) {
                if (entry.key == key) {
                    return entry.value;
                }
            }
        }

        return null;
    }

//    public void remove(int key) {
//        key = key % size;
//        for (int i = 0; i < entries[key].size(); i++) {
//            if (entries[key].get(i).key == key)
//                entries[key].remove(i);
//        }
//    }

    public void print() {
        for (int i = 0; i < entries.length; i++) {
            for (int j = 0; j < entries[i].size(); j++) {
                System.out.print(i + " row " + j);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        var hashtable = new HashTable();
        hashtable.put(6, "A");
        hashtable.put(8, "B");
        hashtable.put(11, "C");
        System.out.println(hashtable.get(10));
    }
}
