import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class File {
    public static void main(String[] args) throws FileNotFoundException {

//        Path path = Paths.get("sample2.txt");
//        try {
//            Files.lines(path).forEach(line -> System.out.println(line));
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

//        Path path1 = Paths.get(".");
//        try{
//            System.out.println("Pliki w folderze: ");
//            Files.list(path1).forEach(f-> System.out.println(f.getFileName()));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }



            FileInputStream fis = new FileInputStream("sample.txt");

            //Scanner skan = new Scanner(fis);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz wyraz:");
        String wyraz = scanner.nextLine();

            while (scanner.hasNext()) {

                wyraz = scanner.next();

                if (wyraz.equals(wyraz)) {

                }

                System.out.println();

            }
        }
    }
