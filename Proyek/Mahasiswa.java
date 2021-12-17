public class Mahasiswa extends Manusia{
    private String nim;
    private String nama;
    private double ipk;
    private int semester;
    public Mahasiswa(String nim, String nama, double ipk, double tinggiBadan) {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.tinggiBadan = tinggiBadan;
    }
    public void setNIM(String nim) {
        this.nim = nim;
    }
    public String getNIM() {
        return this.nim;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return this.nama;
    }
    public void setIPK(double ipk) {
        this.ipk = ipk;
    }
    public double getIPK() {
        return this.ipk;
    }
    public void setTinggiBadan(double tinggiBadan) {
        this.tinggiBadan = tinggiBadan;
    }
    public double getTinggiBadan() {
        return this.tinggiBadan;
    }
    public void getDetail() {
        System.out.print(this.nim + "    " + this.nama + "    " + this.ipk + "       " + this.tinggiBadan + "          ");
    }
}
