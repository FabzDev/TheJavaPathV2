package edu.fabzdev.multithread;

/**
 *
 * @author fabio
 */
public class MultithreadTest1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Prueba " + i);
        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new MultithreadTest1());
        t1.start();
        System.out.println("FIN");
    }
}
