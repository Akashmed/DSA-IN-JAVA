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
        var entry = getEntry(key);
        if (entry != null) {
            entry.value = value;
            return;
        }

        getOrCreateBucket(key).add(new Entry(key, value));
    }

    private int hast(int key) {
        return Math.floorMod(key, entries.length);
    }

    public String get(int key) {
        var entry = getEntry(key);
        return (entry == null) ? null : entry.value;
    }

    public void remove(int key) {
        var entry = getEntry(key);
        if (entry == null)
            throw new IllegalStateException();

        getBucket(key).remove(entry);
    }

    private LinkedList<Entry> getBucket(int key) {
        return entries[hast(key)];
    }

    private LinkedList<Entry> getOrCreateBucket(int key) {
        var index = hast(key);
        var bucket = entries[index];
        if (bucket == null)
            entries[index] = new LinkedList<>();

        return bucket;
    }

    private Entry getEntry(int key) {
        var bucket = getBucket(key);
        if (bucket != null) {
            for (var entry : bucket) {
                if (entry.key == key)
                    return entry;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        var hashtable = new HashTable();
        hashtable.put(6, "A");
        hashtable.put(8, "B");
        hashtable.put(11, "C");
        hashtable.put(6, "A++");
        hashtable.remove(11);
        System.out.println(hashtable.get(8));
    }
}
