package CM1;

public class Mahasiswa15 {
    String nim;
    String nama;
    String prodi;

    Mahasiswa15(String nm, String name, String pd) {
        nim = nm;
        nama = name;
        prodi = pd;
    }

    void tampilMahasiswa() {
        System.out.println("NIM: " + nim + " | Nama: " + nama + " | Prodi: " + prodi);
    }
}
