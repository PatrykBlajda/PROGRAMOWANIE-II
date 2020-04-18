package Regex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz imię:");
        String firstName = scanner.nextLine();
        System.out.println("Wpisz nazwisko:");
        String lastName = scanner.nextLine();

        System.out.println(" Sprawdzenie poprawności:");

        if (!MainInput.validateFirstName(firstName)) {
            System.out.println("Niepoprawne imię");
        } else if (!MainInput.validateLastName(lastName)) {
            System.out.println("Niepoprawne nazwisko");
}
else {

    System.out.println("Dane poprawne. Dziękujemy.");

        }
    }
}
