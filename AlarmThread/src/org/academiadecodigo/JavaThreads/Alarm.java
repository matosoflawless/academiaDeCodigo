package org.academiadecodigo.JavaThreads;
import java.util.Timer;
import java.util.TimerTask;

public class Alarm {
    private Timer timer;

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Alarm alarm = new Alarm();

                    alarm.start();
    }
    public void start() {
        timer = new Timer();
        timer.scheduleAtFixedRate(new Ring(3),2*1000,2);
    }

    private class Ring extends TimerTask {
        int numOfRings;

        public Ring(int numOfRings) {
            this.numOfRings = numOfRings;


        }

        public void stop() {
            timer.cancel();
        }
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName());
            System.out.println("Trim Trim Trim ACORDA CARALHO!!!");
            numOfRings--;


            if (numOfRings <=0) {
                System.out.println("ALAR-ME FOI MANDADO CONTRA A PAREDE");
                stop();
            }
        }
    }
}
