package core.basesyntax;

import core.basesyntax.thread.MyRunnable;
import core.basesyntax.thread.MyThread;

public class Main {
    public static void main(String[] args) {
        MyThread counterThread = new MyThread();

        Runnable runnableThread = new MyRunnable();
        Thread infiniteRunnableThread = new Thread(runnableThread);

        infiniteRunnableThread.setDaemon(true);

        counterThread.start();
        infiniteRunnableThread.start();
    }
}
