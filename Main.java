import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama Kamu: ");
        String nama = scanner.nextLine();

        System.out.println("Hai, " + nama + " Selamat Datang di GIT!");
    }
}
