package ru.vsu.cs.course2;

import ru.vsu.cs.course2.bh.BinaryHeap;
import ru.vsu.cs.course2.bh.IBinaryHeap;
import ru.vsu.cs.course2.priorityQueue.PriorityQueueArr;
import ru.vsu.cs.course2.priorityQueue.PriorityQueueBH;

public class Main {

    public static void main(String[] args) {
//        IBinaryHeap<String> binHeap = new BinaryHeap<>(8);
//        binHeap.returnMax();
//        binHeap.insert("made", 30);
//        binHeap.insert("I", 56);
//        binHeap.insert("it", 12);
//        binHeap.printHB();
//        System.out.println(binHeap.size());
//        System.out.println("--  --*--   --");
//
//        System.out.println(binHeap.extractMax() + " size is " + binHeap.size());
//        binHeap.printHB();
//        System.out.println(binHeap.returnMax());
//        System.out.println("--  --*--   --");
//
//        binHeap.insert("apple", 3);
//        binHeap.insert("orange", 5);
//        binHeap.increase(binHeap.getEntry(3), 62);
//        binHeap.printHB();

        System.out.println("--  --*--   --*--  --*--   --");
        PriorityQueueBH<String> priorityQueueBH = new PriorityQueueBH<>(2);
        priorityQueueBH.insert("White", 10);
        priorityQueueBH.printPriorityQueue();
        System.out.println();

        priorityQueueBH.insert("Yellow", 5);
        priorityQueueBH.printPriorityQueue();
        System.out.println();

        System.out.println("Max " + priorityQueueBH.extractMax());
        priorityQueueBH.printPriorityQueue();
        System.out.println();

        priorityQueueBH.insert("Yellow", 15);
        priorityQueueBH.printPriorityQueue();
        System.out.println();

        priorityQueueBH.insert("Black", 11);
        System.out.println("size " + priorityQueueBH.size());
        priorityQueueBH.printPriorityQueue();

        System.out.println("\nextractMax(): " + priorityQueueBH.extractMax());
        priorityQueueBH.printPriorityQueue();
        System.out.println("\nincrease: ");
        priorityQueueBH.increase(priorityQueueBH.getEntry(5), 13);
        priorityQueueBH.printPriorityQueue();

        /*
        System.out.println("--  --*--   --*--  --*--   --");
        PriorityQueueArr<String> priorityQueueArr = new PriorityQueueArr<>(2);
        priorityQueueArr.insert("Cat", 5);
        priorityQueueArr.insert("Dog", 3);
        priorityQueueArr.insert("Bird", 20);
        System.out.println("size " + priorityQueueArr.size());
        priorityQueueArr.printPQArr();

         */


    }


}
