package ru.vsu.cs.course2.priorityQueue;

import ru.vsu.cs.course2.bh.EntryBH;
import ru.vsu.cs.course2.priorityQueue.IPriorityQueue;

public class PriorityQueueArr<T> implements IPriorityQueue<T> {

    private EntryBH<T>[] items;
    private int capacity;
    private int currSize;
    private int maxVal = Integer.MIN_VALUE;
    private int maxIndex = 0;

    public PriorityQueueArr(int capacity) {
        this.items = new EntryBH[capacity];
        this.currSize = 0;
        this.capacity = capacity;
    }

    @Override
    public void insert(T x, int p) {
        if (currSize == capacity) {
            EntryBH<T>[] newItems = new EntryBH[capacity * 2];
            for (int i = 0; i < capacity; i++) {
                newItems[i] = items[i];
            }
            capacity *= 2;
            items = newItems;
        }
        EntryBH<T> entry = new EntryBH<>(p, x);
        items[currSize] = entry;

        if (maxVal < p) {
            maxIndex = currSize;
        }

        currSize += 1;

    }

    @Override
    public T extractMax() {
        if (currSize == 0) {
            System.out.println("Empty");
            return null;
        }
        T maxItem = items[maxIndex].getValue();
        items[maxIndex] = items[currSize - 1];
        currSize -= 1;
        return maxItem;
    }

    @Override
    public void increase(EntryBH<T> entry, int p) {
        if (currSize < 1) {
            System.out.println("Empty");
        } else {
            int indOfItem = 0;
            if (currSize == 1) {
                items[0].setKey(p);
            } else {
                for (int i = 0; i < currSize; i++) {
                    if (items[i].getKey() == entry.getKey()) {
                        indOfItem = i;
                    }
                }
                if (entry.getKey() >= p) {
                    System.out.println(entry.getKey() + " " + p);
                    System.out.println("New key is less or equal then current key");
                } else {
                    items[indOfItem].setKey(p);
                }
            }
        }
    }

    @Override
    public EntryBH<T> getEntry(int key) {
        if (currSize < 1) {
            System.out.println("Empty");
        } else {
            for (int i = 0; i < currSize; i++) {
                if (items[i].getKey() == key) {
                    int k = items[i].getKey();
                    T val = items[i].getValue();
                    return new EntryBH<T>(k, val);
                }
            }
        }
        return null;
    }


    public int size() {
        return currSize;
    }

    public void printPQArr() {
        for (int i = 0; i < currSize; i++) {
            System.out.println(items[i].getKey() + " " + items[i].getValue());
        }
    }

}
