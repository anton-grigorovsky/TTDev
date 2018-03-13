/**
 * Created by Антон on 12.03.2018.
 */
public class ThreadEntity implements Runnable {

    private static final int DELAY = 200;

    private volatile static boolean isStopped = false;
    private int num;
    private StringStorage storage;

    public ThreadEntity(int num, StringStorage storage) {
        this.num = num;
        this.storage = storage;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!isStopped) {
            try {
                synchronized (storage) {
                    int count = 0;
                    while (count < 10 && !isStopped) {
                        storage.add(num);
                        count++;
                        Thread.sleep(DELAY);

                    }
                }
                Thread.yield();
                Thread.sleep(DELAY);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void setIsStopped(boolean value) {
        isStopped = value;
    }


}
