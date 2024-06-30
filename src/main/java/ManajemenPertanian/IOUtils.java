package ManajemenPertanian;

import java.util.Scanner;

// Kelas utilitas untuk operasi input/output sederhana
public class IOUtils {
    private static Scanner scanner = new Scanner(System.in);

    // Metode untuk membaca input string dari pengguna
    public static String bacaString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // Metode untuk membaca input integer dari pengguna dengan validasi
    public static int bacaInt(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Input tidak valid. Harap masukkan angka.");
            System.out.print(prompt);
            scanner.next();
        }
        int result = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer
        return result;
    }

    // Metode untuk membaca input double dari pengguna dengan validasi
    public static double bacaDouble(String prompt) {
        System.out.print(prompt);
        while (!scanner.hasNextDouble()) {
            System.out.println("Input tidak valid. Harap masukkan angka desimal.");
            System.out.print(prompt);
            scanner.next();
        }
        double result = scanner.nextDouble();
        scanner.nextLine(); // Membersihkan buffer
        return result;
    }
}

