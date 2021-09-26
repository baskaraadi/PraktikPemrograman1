import java.util.Scanner;

public class cobainput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan nama Anda : ");
        String namaLengkap = scanner.nextLine();

        System.out.print("Masukan umur Anda : ");
        int umur = scanner.nextInt();

        System.out.println("Nama Anda adalah " + namaLengkap);
        System.out.println("Umur Anda adalah " + umur);

    };

    
}
