package P2;

public class MataKuliah15 {
    String kodeMK15;
    String nama15;
    int sks15;
    int jmlJam15;

    void tampilInformasi15() {
        System.out.println("Kode mata kuliah: " + kodeMK15);
        System.out.println("Nama: " + nama15);
        System.out.println("SKS: " + sks15);
        System.out.println("Jumlah jam: " + jmlJam15);
    }

    void ubahSKS15(int sksBaru15) {
        sks15 = sksBaru15;
        System.out.println("SKS berhasil diubah menjadi: " + sks15);
    }

    void tambahJam15(int jam15) {
        jmlJam15 += jam15;
    }

    void kurangiJam15(int jam15) {
        if (jmlJam15 - jam15 >= 0) {
            jmlJam15 -= jam15;
            System.out.println("Jumlah jam berhasil dikurangi. Jumlah jam saat ini: " + jmlJam15);
        } else {
            System.out.println("Jumlah jam tidak dapat dikurangi.");
        }
    }

    public MataKuliah15() {
    }

    public MataKuliah15(String kodeMK15, String nama15, int sks15, int jmlJam15) {
        this.kodeMK15 = kodeMK15;
        this.nama15 = nama15;
        this.sks15 = sks15;
        this.jmlJam15 = jmlJam15;
    }
}
