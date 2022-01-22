package theory.multithreading.threadPool;

import java.util.Queue;

public class ThreadPool extends Thread{
    private final Queue<Runnable> tasks;

    public ThreadPool(Queue<Runnable> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (tasks) {
                if (!tasks.isEmpty()) {
                    Runnable task = tasks.poll();
                    task.run();
                }
            }
        }
    }
}
