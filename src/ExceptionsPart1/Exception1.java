package ExceptionsPart1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        File file = new File("text");
        try {
            Scanner scanner = new Scanner(file);
            System.out.println("После Scanner");
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        System.out.println("После блока try catch");
    }
}
