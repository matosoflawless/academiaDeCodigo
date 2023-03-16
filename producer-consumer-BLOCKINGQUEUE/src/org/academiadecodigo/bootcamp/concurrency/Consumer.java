package org.academiadecodigo.bootcamp.concurrency;

import org.academiadecodigo.bootcamp.concurrency.bqueue.BQueue;
import org.academiadecodigo.bootcamp.concurrency.bqueue.Pizza;

import java.util.LinkedList;

/**
 * Consumer of integers from a blocking queue
 */
public class Consumer implements Runnable {

    private final BQueue queue;
    private int elementNum;
    private final LinkedList<Pizza> pizzaTable;

    /**
     * @param queue the blocking queue to consume elements from
     * @param elementNum the number of elements to consume
     */
    public Consumer(BQueue queue, int elementNum, LinkedList<Pizza> pizzaTable) {
        this.queue = queue;
        this.elementNum = elementNum;
        this.pizzaTable = pizzaTable;
    }


    @Override
    public void run() {
        for (int i = 0; i < elementNum; i++) {
            try {
                Pizza pizza = queue.poll();
                pizzaTable.add(pizza);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}