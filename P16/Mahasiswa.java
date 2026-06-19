package P16;

public class Mahasiswa {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNoTelp() {
        return notelp;
    }

    @Override
    public String toString() {
        return String.format("%-8s %-20s %-10s", nim, nama, notelp);
    }
}