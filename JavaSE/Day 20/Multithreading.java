public class Multithreading {
}


class Thread1 extends  Thread{
    private String threadName;

    Thread1(String name){
        threadName = name;
    }

    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println(threadName + " - Count: " + i);
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished.");
    }
}

class TestThread1 {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1("Thread 1");
        Thread1 thread2 = new Thread1("Thread 2");
        Thread1 thread3 = new Thread1("Thread 3");
        Thread1 thread4 = new Thread1("Thread 4");
        Thread1 thread5 = new Thread1("Thread 5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

        try{
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        System.out.println("All threads have finished");
    }
}

class Thread2 implements Runnable{

    @Override
    public void run() {
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("The state of thread t1 " );
    }
}

class ThreadState implements Runnable {
    public static Thread t1;
    public static ThreadState obj;

    public static void main(String[] args) {
        obj = new ThreadState();
        t1 = new Thread(obj);

        System.out.println("The state of thread t1 after " + t1.getState());

        t1.start();
        System.out.println("The state of thread t1 after invoking the method start() " + t1.getState());
    }
    @Override
    public void run() {
      Thread2  obj = new Thread2();
      Thread t2 = new Thread(obj);

        System.out.println("The state of thread t2 after " + t2.getState());
        t2.start();
        System.out.println("The state of thread t1 after invoking the method start() " + t2.getState());
    }
}