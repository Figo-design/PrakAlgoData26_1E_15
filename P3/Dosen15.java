package P3;

public class Dosen15 {
    public String kode15;
    public String nama15;
    public boolean jenisKelamin15;
    public int usia15;

    public Dosen15(String kode15, String nama15, boolean jenisKelamin15, int usia15) {
        this.kode15 = kode15;
        this.nama15 = nama15;
        this.jenisKelamin15 = jenisKelamin15;
        this.usia15 = usia15;
    }

    public void cetakInfo15() {
        System.out.println("Kode            : " + kode15);
        System.out.println("Nama            : " + nama15);
        System.out.println("Jenis Kelamin   : " + jenisKelamin15);
        System.out.println("Usia            : " + usia15);
    }
}
