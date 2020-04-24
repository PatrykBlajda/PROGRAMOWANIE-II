package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class UruchomIZaczekaj {
    public static void main(String[] args) throws InterruptedException {
        java.util.concurrent.ExecutorService service = Executors.newFixedThreadPool(2);

        service.execute(() -> {
            for(int i = 0; i < 100;i++) {
                System.out.println(i);
            }
        });

        service.execute(() -> {
            for(int i = 0; i < 1000000;i++) {
                System.out.println(i);
            }
        });

        service.shutdown();
        service.awaitTermination(10, TimeUnit.SECONDS);
    }
}