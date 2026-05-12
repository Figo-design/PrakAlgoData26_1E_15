package P11;

public class Mahasiswa15 {
    String nim;
    String nama;
    String kelas;
    double ipk;

    public Mahasiswa15() {
    }

    public Mahasiswa15(String name, String nm, String kls, double ip) {
        nama = name;
        nim = nm;
        kelas = kls;
        ipk = ip;
    }

    public void tampilkanData() {
        System.out.printf("%-10s %-12s %-5s %.1f%n", nama, nim, kelas, ipk);
    }
}