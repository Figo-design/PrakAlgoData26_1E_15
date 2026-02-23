package P2;

public class DosenMain15 {
    public static void main(String[] args) {
        Dosen15 dsn1 = new Dosen15("RS", "Prof. Resya", true, 2005, "Backend Development");
        dsn1.tampilInformasi15();
        dsn1.setStatusAktif15(false);
        dsn1.hitungMasaKerja15(2026);
        dsn1.tampilInformasi15();
        System.out.println();

        Dosen15 dsn2 = new Dosen15();
        dsn2.idDosen15 = "FR";
        dsn2.nama15 = "Dr. Farid";
        dsn2.statusAktif15 = true;
        dsn2.thnBergabung15 = 2015;
        dsn2.bidangKeahlian15 = "UI/UX Design";
        dsn2.tampilInformasi15();

        dsn2.thnBergabung15 = 2025;
        dsn2.bidangKeahlian15 = "Bahasa Inggris";
        dsn2.tampilInformasi15();
    }   
}
