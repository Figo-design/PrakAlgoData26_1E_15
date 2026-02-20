package P2;

public class Mahasiswa15 {

    String nama15;
    String nim15;
    String kelas15;
    double ipk15;

    void tampilkanInformasi15() {
        System.out.println("Nama: " + nama15);
        System.out.println("NIM: " + nim15);
        System.out.println("Kelas: " + kelas15);
        System.out.println("IPK: " + ipk15);
    }

    void ubahKelas15(String kelasBaru15) {
        kelas15 = kelasBaru15;
    }

    void updateIpk15(double ipkBaru15) {
        if (ipkBaru15 >= 0.0 && ipkBaru15 <= 4.0) {
            ipk15 = ipkBaru15;
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    String nilaiKinerja15() {
        if (ipk15 >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk15 >= 3.0) {
            return "Kinerja baik";
        } else if (ipk15 >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}
