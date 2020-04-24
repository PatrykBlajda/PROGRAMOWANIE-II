package Threads;

public class Main {
    public static void main(String[] args) {
        ZadaniePi zadaniePi = new ZadaniePi();
        double pi = zadaniePi.monteCarlo(100);
        System.out.println(pi);

    }
}
