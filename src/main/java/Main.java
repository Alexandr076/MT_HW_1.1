public class Main {
    public static void main(String[] args) throws InterruptedException {
        ThreadGroup threadGroup = new ThreadGroup("My thread group");
        MyThread myThread1 = new MyThread("MyThread1", threadGroup);
        MyThread myThread2 = new MyThread("MyThread2", threadGroup);
        MyThread myThread3 = new MyThread("MyThread3", threadGroup);
        MyThread myThread4 = new MyThread("MyThread4", threadGroup);

        Thread.sleep(15000);
        threadGroup.interrupt();
    }
}
