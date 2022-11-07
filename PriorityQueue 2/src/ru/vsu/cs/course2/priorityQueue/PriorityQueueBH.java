package ru.vsu.cs.course2.priorityQueue;

import ru.vsu.cs.course2.bh.BinaryHeap;
import ru.vsu.cs.course2.bh.EntryBH;


public class PriorityQueueBH<T> implements IPriorityQueue<T> {

    private BinaryHeap<T> binaryHeap;

    public PriorityQueueBH(int size) {
        this.binaryHeap = new BinaryHeap<>(size);
    }

    @Override
    public void insert(T x, int p) {
        binaryHeap.insert(x, p);
    }

    @Override
    public T extractMax() {
        return binaryHeap.extractMax();
    }

    @Override
    public void increase(EntryBH<T> entry, int p) {
        binaryHeap.increase(entry, p);
    }

    @Override
    public EntryBH<T> getEntry(int key) {
        return binaryHeap.getEntry(key);
    }

    public void printPriorityQueue() {
        binaryHeap.printHB();
    }

    public int size() {
        return binaryHeap.size();
    }
}
