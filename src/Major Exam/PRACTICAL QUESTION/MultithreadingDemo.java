
// 19.	Write a Java program to implement multithreading by 
// extending the Thread class and implementing the Runnable interface.

// Extending the Thread class

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread (extending Thread): " + i);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Implementing the Runnable interface
class MyRunnable implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread (implementing Runnable): " + i);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        thread1.start();

        MyRunnable runnable = new MyRunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}