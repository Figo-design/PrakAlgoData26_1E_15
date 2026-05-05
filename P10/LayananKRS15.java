package P10;

import java.util.Scanner;

public class LayananKRS15 {
    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);
        AntrianKRS15 antrian = new AntrianKRS15(10);
        int pilihan;

        do {
            System.out.println("\n=== Menu Antrian Layanan KRS===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Proses KRS");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat Antrian 2 Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Lihat Jumlah Sudah Diproses");
            System.out.println("8. Lihat Jumlah Mahasiswa Belum KRS");
            System.out.println("9. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = figo.nextInt();
            figo.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = figo.nextLine();
                    System.out.print("Nama  : ");
                    String nama = figo.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = figo.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = figo.nextLine();
                    antrian.enqueue(new Mahasiswa15(nim, nama, prodi, kelas));
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampil2Terdepan();
                    break;
                case 5:
                    System.out.println("Antrian paling akhir:");
                    antrian.lihatAkhir();
                    break;
                case 6:
                    antrian.jumlahAntrian();
                    break;
                case 7:
                    antrian.jumlahDiproses();
                    break;
                case 8:
                    antrian.belumKRS();
                    break;
                case 9:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilihan != 0);
        figo.close();
    }
}