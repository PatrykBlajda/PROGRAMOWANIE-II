package Threads;

public class ZadaniePi {

    public double monteCarlo(long iterations) {
        int hitCount = 0;
        for (long i = 0; i < iterations; i++) {
            double x = Math.random();
            double y = Math.random();
            double r = Math.sqrt(x * x + y * y);
            if (r <= 1) {
                hitCount++;
            }
        }
        return 4.0 * hitCount / iterations;
    }
}
