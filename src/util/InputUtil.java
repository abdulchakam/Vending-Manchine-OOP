package util;

import java.util.Scanner;

public class InputUtil {
    private static Scanner scanner = new Scanner(System.in);

    public static int inputInt(String info) {
        System.out.print(info + " : ");

        while (!scanner.hasNextInt()) {
            System.out.println("Anda hanya bisa memasukan angka saya");
            scanner.nextLine();
        }

        int data = scanner.nextInt();
        scanner.nextLine();
        return data;
    }

    public static long inputLong(String input) {
        System.out.print(input + " : ");

        while (!scanner.hasNextLong()) {
            System.out.println("Anda hanya bisa memasukkan angka.");
            scanner.nextLine();
        }

        long nominal = scanner.nextLong();
        scanner.nextLine();
        return nominal;
    }
}
