package ru.vsu.cs.course2.priorityQueue;

import ru.vsu.cs.course2.bh.EntryBH;

public interface IPriorityQueue<T> {

    void insert(T x, int p);
    T extractMax();
    // повысить приоритет элемента x на p
    void increase(EntryBH<T> entry, int p);
    EntryBH<T> getEntry(int key);

}
