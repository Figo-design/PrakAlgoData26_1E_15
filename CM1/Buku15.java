package CM1;

public class Buku15 {
    String kodeBuku;
    String judul;
    int tahunTerbit;

    Buku15(String kb, String jd, int tb) {
        kodeBuku = kb;
        judul = jd;
        tahunTerbit = tb;
    }

    void tampilBuku() {
        System.out.println("Kode: " + kodeBuku + " | Judul: " + judul + " | Tahun: " + tahunTerbit);
    }
}
