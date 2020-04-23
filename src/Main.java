public class Main {

    public static void main(String[] args) throws InterruptedException {
        int n = 8;

        for (int i = 0; i < n; i++) {
            MultithreadingDemo obj = new MultithreadingDemo();
            obj.start();
            Thread myRunnable = new Thread(new MyRunnable());
            myRunnable.start();
            System.out.println("Main Thread " + i);
            myRunnable.join();
        }
        synchronized (Thread.currentThread()){

            Thread.currentThread().setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                @Override
                public void uncaughtException(Thread t, Throwable e) {
                    System.out.println("Exception : " + e.getMessage());
                }
            });
            System.out.println(2/0);
        }
    }
}
