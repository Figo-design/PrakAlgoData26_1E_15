package CM1;

import java.util.Scanner;

public class DemoPeminjaman15 {
    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);
        DataPeminjaman15 data = new DataPeminjaman15();

        int menu;
        do {
            System.out.println("\n=== SISTEM PEMINJAMAN RUANG BACA JTI ===");
            System.out.println("1. Tampilkan Mahasiswa");
            System.out.println("2. Tampilkan Buku");
            System.out.println("3. Tampilkan Peminjaman");
            System.out.println("4. Urutkan Berdasarkan Denda");
            System.out.println("5. Cari Berdasarkan NIM");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            menu = figo.nextInt();
            figo.nextLine();

            switch (menu) {
                case 1:
                    System.out.println("Daftar Mahasiswa: ");
                    data.tampilMahasiswa();
                    break;
                case 2:
                    System.out.println("Daftar Buku: ");
                    data.tampilBuku();
                    break;
                case 3:
                    System.out.println("Data Peminjaman: ");
                    data.tampilPeminjaman();
                    break;
                case 4:
                    System.out.println("Setelah diurutkan (Denda terbesar): ");
                    data.sortingDenda();
                    data.tampilPeminjaman();
                    break;
                case 5:
                    System.out.print("Masukkan NIM: ");
                    String nim = figo.nextLine();
                    int posisi = data.findBinarySearch(nim, 0, data.mhs.length - 1);
                    data.tampilDataSearch(posisi, nim);
                    break;
                case 0:
                    System.out.println("Keluar.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (menu != 0);

        figo.close();
    }
}
