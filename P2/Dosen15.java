package P2;

public class Dosen15 {
    String idDosen15;
    String nama15;
    boolean statusAktif15;
    int thnBergabung15;
    String bidangKeahlian15;

    void tampilInformasi15() {
        System.out.println("Id Dosen: " + idDosen15);
        System.out.println("Nama: " + nama15);
        System.out.println("Status aktif: " + statusAktif15);
        System.out.println("Tahun bergabung: " + thnBergabung15);
        System.out.println("Bidang Keahlian: " + bidangKeahlian15);
    }

    void setStatusAktif15(boolean status15) {
        statusAktif15 = status15;
    }

    int hitungMasaKerja15(int thnSkrg15) {
        int masaKerja15 = thnSkrg15 - thnBergabung15;
        System.out.println("Masa kerja: " + masaKerja15 + " tahun");
        return masaKerja15;
    }

    void ubahBidangKeahlian15(String bidang15) {
        bidangKeahlian15 = bidang15;
    }

    public Dosen15() {
    }

    public Dosen15(String idDosen15, String nama15, boolean statusAktif15, int thnBergabung15, String bidangKeahlian15) {
        this.idDosen15 = idDosen15;
        this.nama15 = nama15;
        this.statusAktif15 = statusAktif15;
        this.thnBergabung15 = thnBergabung15;
        this.bidangKeahlian15 = bidangKeahlian15;
    }
}
