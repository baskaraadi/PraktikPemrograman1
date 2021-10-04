import java.util.Scanner;

public class TugasPertemuan5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan IPK = ");
        float ipk = scanner.nextFloat();
        System.out.print("Masukan waktu lama studi = ");
        float waktu = scanner.nextFloat();
        if (ipk >= 3.51 && ipk < 4 && waktu <= 4) {
            System.out.println("Summa Cumlaude");
        } else if (ipk >=3.51 && waktu > 4) {
            System.out.println("Cumlaude");
        } else if (ipk >= 3.01 && ipk <=3.51) {
            System.out.println("Sangat Memuaskan");
        } else if (ipk >= 2.76 && ipk < 3.01) {
            System.out.println("Memuaskan");
        } else if (ipk >= 2.00 && ipk < 2.76) {
            System.out.println("Cukup");
        } else if (ipk > 0 && ipk < 2.00) {
            System.out.println("Tidak lulus");
        } else {
            System.out.println("IPK tidak valid");
        }
        System.out.println("Terima Kasih");
    }
}