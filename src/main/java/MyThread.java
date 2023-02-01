public class MyThread extends Thread {
    public MyThread(String threadName, ThreadGroup threadGroup) {
        super(threadGroup, threadName);
        start();
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.println("Hello! My name is " + getName());
            }
        } catch (InterruptedException e) {

        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
