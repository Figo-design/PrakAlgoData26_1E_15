package P2;

public class MahasiswaMain15 {
    public static void main(String[] args) {
        Mahasiswa15 mhs1 = new Mahasiswa15();
        mhs1.nama15 = "Muhammad Ali Farhan";
        mhs1.nim15 = "2241720171";
        mhs1.kelas15 = "SI 2J";
        mhs1.ipk15 = 3.55;

        mhs1.tampilkanInformasi15();
        mhs1.ubahKelas15("SI 2K");
        mhs1.updateIpk15(3.60);
        mhs1.tampilkanInformasi15();

         Mahasiswa15 mhs2 = new Mahasiswa15("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk15(3.30);
        mhs2.tampilkanInformasi15();
    }   
}
