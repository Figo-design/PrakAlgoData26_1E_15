package P16;

public class Mahasiswa15 {
    String nim;
    String nama;
    String notelp;

    public Mahasiswa15() {
    }

    public Mahasiswa15(String nim, String nama, String notelp) {
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
}
