package theory.multithreading.executorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();


        executorService.submit(() -> {
            try {
                Thread.sleep(30000);
                System.out.println("LALAL");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        executorService.shutdown();
//        executorService.shutdownNow();

    }
}
