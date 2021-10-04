import java.util.Scanner;

public class BelajarOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai A = ");
        double a = scanner.nextDouble();
        System.out.print("Masukan nilai B = ");
        double b = scanner.nextDouble();
        System.out.println("A == B = " + (a==b));
        System.out.println("A != B = " + (a!=b));
        System.out.println("A > B = " + (a>b));
        System.out.println("A < B = " + (a<b));
        System.out.println("A >= B = " + (a>=b));
        System.out.println("A <= B = " + (a<=b));
        boolean hasil = (a < 6 && b > 2);
        System.out.println("hasil A < 6 && B > 2 adalah " + hasil);
        System.out.println("hasil A < 6 || B > 2 adalah " + (a < 6 || b > 2));
        System.out.println("hasil !(A < 6 && B > 2) adalah " + !hasil);
    }
}
