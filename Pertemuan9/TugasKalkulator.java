import java.util.Scanner;
public class TugasKalkulator {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan nilai A = ");
        float a = scan.nextFloat();
        System.out.print("Masukan nilai B = ");
        float b = scan.nextFloat();

        float hasil = penjumlahan(a, b);
        System.out.println("Nilai A + B = " + hasil);
        float hasil2 = pengurangan(a, b);
        System.out.println("Nilai A - B = " + hasil2);
        float hasil3 = perkalian(a, b);
        System.out.println("Nilai A x B = " + hasil3);
        float hasil4 = pembagian(a, b);
        System.out.println("Nilai A / B = " + hasil4);

        scan.close();
    }

    public static float penjumlahan(float a, float b) {
        float hasil = a + b;
        return hasil;
    }
    public static float pengurangan(float a, float b) {
        float hasil2 = a - b;
        return hasil2;
    }
    public static float perkalian(float a, float b) {
        float hasil3 = a * b;
        return hasil3;
    }
    public static float pembagian(float a, float b) {
        float hasil4 = a / b;
        return hasil4;
    }
}