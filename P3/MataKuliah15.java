package P3;

public class MataKuliah15 {
    public String kode15;
    public String nama15;
    public int sks15;
    public int jumlahJam15;
    public String ruang15;
    
    public MataKuliah15(String kode15, String nama15, int sks15, int jumlahJam15) {
        this.kode15 = kode15;
        this.nama15 = nama15;
        this.sks15 = sks15;
        this.jumlahJam15 = jumlahJam15;
    }

    public void tambahData15(String ruang15) {
        this.ruang15 = ruang15;
    }

    public void cetakInfo15() {
        System.out.println("Kode        : " + kode15);
        System.out.println("Nama        : " + nama15);
        System.out.println("Sks         : " + sks15);
        System.out.println("Jumlah Jam  : " + jumlahJam15);            
        System.out.println("Ruang       : " + ruang15);
        System.out.println("-----------------------------------");
    }
}
