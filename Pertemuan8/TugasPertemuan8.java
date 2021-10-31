import java.util.Scanner;

public class TugasPertemuan8 {
    public static void main(String[] args) {
        System.out.println("Masukan Data");
        String[] nama = new String[1000];
        double[] ipk = new double[1000];
        double jumlah, rerata;
        int i;
        jumlah = 0;
        for(i = 1; i <= 1000; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Data " + i);
            System.out.print("Nama Mahasiswa = ");
            String cek1 = scan.nextLine();
            if (cek1.equals("exit")) {
                break;
            } else {
                nama[i] = cek1;
            }

            System.out.print("IPK Mahasiswa = ");
            double cek2 = scan.nextDouble();
            scan.nextLine();
            ipk[i] = cek2;

            System.out.println();
            jumlah += ipk[i];
        }

        System.out.println();
        System.out.println("Menampilkan Data ");
        System.out.println("No  Nama Mahasiswa         IPK");
        System.out.println("------------------------------");

        for(int j = 1; j < i; j++) {
            System.out.println( j + "   " + nama[j] + "                   " + ipk[j] );
        }

        System.out.println("------------------------------");
        rerata = jumlah/(i-1);
        System.out.println("Rata-rata IPK = " + rerata );
    }
}