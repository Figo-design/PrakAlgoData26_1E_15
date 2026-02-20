package P1;

import java.util.Scanner;

public class Jadwal {

    static Scanner figo = new Scanner(System.in);

    static void inputJadwal15(String[][] jadwal15, int jumlahJadwal15) {
        for (int i = 0; i < jumlahJadwal15; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            jadwal15[i][0] = figo.nextLine();

            System.out.print("Ruang: ");
            jadwal15[i][1] = figo.nextLine();

            System.out.print("Hari: ");
            jadwal15[i][2] = figo.nextLine();

            System.out.print("Jam: ");
            jadwal15[i][3] = figo.nextLine();
        }
    }

    static void tampilSemua15(String[][] jadwal15, int jumlahJadwal15) {
        System.out.println("\n======= DAFTAR JADWAL KULIAH ========");
        System.out.printf("%-15s %-10s %-10s %-10s\n","Mata Kuliah", "Ruang", "Hari", "Jam");
        for (int i = 0; i < jumlahJadwal15; i++) {
            System.out.printf("%-15s %-10s %-10s %-10s\n", jadwal15[i][0], jadwal15[i][1], jadwal15[i][2], jadwal15[i][3]);
        }
    }

    static void cariHari15(String[][] jadwal15, int jumlahJadwal15) {
        System.out.print("\nMasukkan hari yang dicari: ");
        String hari15 = figo.nextLine();

        boolean found15 = false;
        System.out.printf("%-15s %-10s %-10s\n","Mata Kuliah", "Ruang", "Jam");
        for (int i = 0; i < jumlahJadwal15; i++) {
            if (jadwal15[i][2].equalsIgnoreCase(hari15)) {
                System.out.printf("%-15s %-10s %-10s\n", jadwal15[i][0], jadwal15[i][1], jadwal15[i][3]);
                found15 = true;
            }
        }
        if (!found15) {
            System.out.println("Tidak ada jadwal di hari tersebut.");
        }
    }

    static void cariMK15(String[][] jadwal15, int jumlahJadwal15) {
        System.out.print("\nMasukkan nama mata kuliah yang dicari: ");
        String mk15 = figo.nextLine();

        boolean found15 = false;
        System.out.printf("%-10s %-10s %-10s\n","Ruang", "Hari", "Jam");
        for (int i = 0; i < jumlahJadwal15; i++) {
            if (jadwal15[i][0].equalsIgnoreCase(mk15)) {
                System.out.printf("%-10s %-10s %-10s\n", jadwal15[i][1], jadwal15[i][2], jadwal15[i][3]);
                found15 = true;
            }
        }
        if (!found15) {
            System.out.println("Mata kuliah tidak ditemukan.");
        }
    }

    public static void main(String[] args) {

        String[][] jadwal15 = null;
        int jumlahJadwal15 = 0;

        int pilihan15;
        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Input Jadwal Kuliah");
            System.out.println("2. Tampilkan Semua Jadwal");
            System.out.println("3. Cari Jadwal Berdasarkan Hari");
            System.out.println("4. Cari Jadwal Berdasarkan Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan15 = Integer.parseInt(figo.nextLine());

            switch (pilihan15) {
                case 1:
                    System.out.print("Masukkan jumlah jadwal kuliah: ");
                    jumlahJadwal15 = Integer.parseInt(figo.nextLine());

                    jadwal15 = new String[jumlahJadwal15][4];
                    inputJadwal15(jadwal15, jumlahJadwal15);
                    break;
                case 2:
                    tampilSemua15(jadwal15, jumlahJadwal15);
                    break;
                case 3:
                    cariHari15(jadwal15, jumlahJadwal15);
                    break;
                case 4:
                    cariMK15(jadwal15, jumlahJadwal15);
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan15 != 5);

        figo.close();
    }
}
