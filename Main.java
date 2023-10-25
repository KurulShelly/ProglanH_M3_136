import java.util.Scanner;

public class InformasiPengguna {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama kamu: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur kamu: ");
        int umur = input.nextInt();

        System.out.println("Halo, " + nama + "!");
        System.out.println("Kamu berusia " + umur + " tahun.");
    }
}