package org.academiadecodigo.bootcamp.concurrency.bqueue;

import java.util.LinkedList;
import java.util.concurrent.Executor;

public class BQueue {

    private final int limit;
    private LinkedList<Pizza> queue;

    public BQueue(int limit) {
        this.limit = limit;
        queue = new LinkedList<>();
    }

    /**
     * Inserts the specified element into the queue
     * Blocking operation if the queue is full
     * @param pizza the data to add to the queue
     *             offer method, you need to check whether the size of
     *             the linked list has reached the maximum limit specified in the constructor.
     */
    public synchronized void offer(Pizza pizza) throws InterruptedException {
        while (queue.size() == limit) {
            wait();
        }

        System.out.println(Thread.currentThread().getName() + " cooked a damm " + ((Pizza) pizza).getTopping() +
                ". I have " + queue.size()  + " pizzas left.");

        queue.add(pizza);
        notifyAll();
    }





    /**
     * Retrieves and removes data from the head of the queue
     * Blocking operation if the queue is empty
     * @return the data from the head of the queue
     */


    public synchronized Pizza poll() throws InterruptedException {
        while (queue.isEmpty()) {
            wait();
        }

        Pizza pizza = (Pizza) queue.removeFirst();
        System.out.println(Thread.currentThread().getName() + " just ate a " + pizza.getTopping() +
                ". There are " + queue.size() + " pizzas left.");

        notifyAll();
        return pizza;
    }


    /**
     * Gets the number of elements in the queue
     * @return the number of elements
     */
    public int getSize() {
       return queue.size();

    }

    /**
     * Gets the maximum number of elements that can be present in the queue
     * @return the maximum number of elements
     */
    public int getLimit(int limit) {
        return limit;

    }

}

