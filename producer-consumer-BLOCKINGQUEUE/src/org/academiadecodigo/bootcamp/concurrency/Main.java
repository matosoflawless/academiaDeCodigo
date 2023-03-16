package org.academiadecodigo.bootcamp.concurrency;

import org.academiadecodigo.bootcamp.concurrency.bqueue.BQueue;
import org.academiadecodigo.bootcamp.concurrency.bqueue.Pizza;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        BQueue queue = new BQueue(10);

        Producer p1 = new Producer(queue, 10);
        Thread t1 = new Thread(p1);
        t1.setName("Julio");

        Producer p2 = new Producer(queue, 10);
        Thread t2 = new Thread(p2);
        t2.setName("Meireles");

        Consumer c1 = new Consumer(queue, 10, new LinkedList<>());
        Thread t3 = new Thread(c1);
        t3.setName("Tony");

        Consumer c2 = new Consumer(queue, 10, new LinkedList<>());
        Thread t4 = new Thread(c2);
        t4.setName("Simon");

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
