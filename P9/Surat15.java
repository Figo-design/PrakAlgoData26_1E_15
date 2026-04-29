package P9;

public class Surat15 {
    String idSurat;
    String namaMahasiswa;
    String kelas;
    char jenisIzin;
    int durasi;

    public Surat15() {
    }

    public Surat15(String id, String nama, String kls, char jenis, int durasi) {
        idSurat = id;
        namaMahasiswa = nama;
        kelas = kls;
        jenisIzin = jenis;
        this.durasi = durasi;
    }
}
