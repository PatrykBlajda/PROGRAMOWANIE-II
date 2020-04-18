package CollectionsNames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Names {

    public static void main(String[] args) {
        words();
    }
        static void words() {
        Scanner sc = new Scanner(System.in);
        List<String> words = new ArrayList<>();
        String line = sc.nextLine();
        while (!"-".equals(line)) {
            words.add(line);
            line = sc.nextLine();
        }

        System.out.println(words);
    }
}


