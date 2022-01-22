package theory.multithreading.threadPool;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        LinkedList<Runnable> list  = new LinkedList<>();
        list.add(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        list.add(() -> {
            System.out.println(Thread.currentThread().getName());
        });
        list.add(() -> {
            System.out.println(Thread.currentThread().getState());
        });
        list.add(() -> {
            System.out.println(Thread.currentThread().getPriority());
        });
        list.add(() -> {
            System.out.println(Thread.currentThread().getPriority());
        });
        ThreadPool threadPool = new ThreadPool(list);
        threadPool.start();
        threadPool.join();
    }
}

