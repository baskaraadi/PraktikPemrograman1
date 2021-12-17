import java.util.Scanner;
public class Siakad {
    Mahasiswa[] mahasiswa = new Mahasiswa[1000];
    public int jumlahdata = 0;
    public static void main(String[] args) {
    Siakad siakad = new Siakad();
        int menu = 0;
        while (menu!=7) {
            menu = tampilanmenu();
            if (menu==1) {
                siakad.tambahdata();
            } else if (menu==2) {
                siakad.lihatdata();
            } else if (menu==3) {
                siakad.rerataIPK();
            } else if (menu==4) {
                siakad.cariData();
            } else if (menu==5) {
                siakad.editNama();
            } else if (menu==6) {
                siakad.hapusData();
            }
        }
    }
    public static int tampilanmenu() {
        Scanner gecko = new Scanner(System.in);
        System.out.println();
        System.out.println("--MENU--");
        System.out.println("1. Menambah Data Mahasiswa");
        System.out.println("2. Melihat Data Mahasiswa");
        System.out.println("3. Rata-rata IPK Mahasiswa");
        System.out.println("4. Cari Data Mahasiswa");
        System.out.println("5. Mengedit Data Mahasiswa");
        System.out.println("6. Menghapus Data Mahasiswa");
        System.out.println("7. Keluar");
        System.out.print("Pilih menu = ");
        int menu = gecko.nextInt();
        return menu;
    }
    private void tambahdata() {
        Scanner gecko = new Scanner(System.in);
        System.out.print("Masukan NIM Mahasiswa = ");
        String nim = gecko.nextLine();
        System.out.print("Masukan Nama Mahasiswa = ");
        String nama = gecko.nextLine();
        double ipk = 0;
        double tinggiBadan = 0;
        try {
            System.out.print("Masukan IPK Mahasiswa = ");
            ipk = gecko.nextDouble();
            System.out.print("Masukan Tinggi Badan Mahasiswa = ");
            tinggiBadan = gecko.nextDouble();
        } catch (Exception e) {
            System.out.println("Harap masukkan bilangan desimal dengan menggunakan titik sebagai koma, Silahkan edit data anda setelah input data");
        }
        Mahasiswa inputMahasiswa = new Mahasiswa(nim, nama, ipk, tinggiBadan);
        mahasiswa[jumlahdata] = inputMahasiswa;
        jumlahdata++;
    }
    private void lihatdata() {
        if (jumlahdata==0) {
            System.out.println("Belum ada data yang dimasukan");
        } else {
            System.out.println("Berikut Data Mahasiswa : ");
            System.out.println("NIM    Nama    IPK    Tinggi Badan");
            for (int i=0; i<jumlahdata;i++) {
                mahasiswa[i].getDetail();
                if (mahasiswa[i].getIPK() >= 3.51 && mahasiswa[i].getIPK() <= 4) {
                System.out.print("CUMLAUDE!");
                } else if (mahasiswa[i].getIPK() >= 3.01 && mahasiswa[i].getIPK() <=3.51) {
                System.out.print("SANGAT MEMUASKAN!");
                } else if (mahasiswa[i].getIPK() >= 2.76 && mahasiswa[i].getIPK() < 3.01) {
                System.out.print("MEMUASKAN!");
                } else if (mahasiswa[i].getIPK() >= 2.00 && mahasiswa[i].getIPK() < 2.76) {
                System.out.print("CUKUP!");
                } else if (mahasiswa[i].getIPK() > 0 && mahasiswa[i].getIPK() < 2.00) {
                System.out.print("TIDAK LULUS!");
                } else {
                System.out.print("IPK yang aneh");
                }
                System.out.println();
            }
        }
    }
    public void rerataIPK() {
        double total = 0.0;
        for(int i=0; i<jumlahdata;i++) {
            total += mahasiswa[i].getIPK();
        }
        double rerata = total/jumlahdata;
        System.out.println("Rerata IPK Mahasiswa = " + rerata);
    }
    public void cariData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM Mahasiswa yang ingin dicari = ");
        String nimcari = scan.nextLine();
        int index = getIndexNIM(nimcari);
        if (index == -1 ) {
            System.out.println("Mahasiswa yang anda cari tidak ada");
        } else {
            System.out.println("NIM    Nama    IPK    Tinggi Badan");
            mahasiswa[index].getDetail();
        }
    }
    public int getIndexNIM(String nimcari) {
        for (int i = 0; i<jumlahdata; i++){
            if (mahasiswa[i].getNIM().equals(nimcari)){
                return i;
            }
        }
        return -1;
    }
    public void editNama() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM Mahasiswa yang ingin diedit = ");
        String nimcari = scan.nextLine();
        int index = getIndexNIM(nimcari);
        if (index == -1 ) {
            System.out.println("Mahasiswa yang anda cari tidak ada");
        } else {
            System.out.println("NIM    Nama    IPK    Tinggi Badan");
            mahasiswa[index].getDetail();
            System.out.println();
            System.out.print("Masukan Nama mahasiswa yang baru = ");
            String namaedit = scan.nextLine();
            mahasiswa[index].setNama(namaedit);
            System.out.print("Masukan IPK mahasiswa yang baru = ");
            double ipkedit = scan.nextDouble();
            mahasiswa[index].setIPK(ipkedit);
            System.out.print("Masukan Tinggi Badan mahasiswa yang baru = ");
            double tinggiBadanedit = scan.nextDouble();
            mahasiswa[index].setTinggiBadan(tinggiBadanedit);
            mahasiswa[index].getDetail();
        }
    }
    public void hapusData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukan NIM Mahasiswa yang ingin dihapus = ");
        String nimcari = scan.nextLine();
        int index = getIndexNIM(nimcari);
        if (index == -1 ) {
            System.out.println("Mahasiswa yang anda cari tidak ada");
        } else {
            for (int i = index; i<jumlahdata; i++){
                mahasiswa[i] = mahasiswa [i+1];
            }
            jumlahdata--;
            lihatdata();
        }
    }
}