package P3;

import java.util.Scanner;

public class MataKuliahDemo15 {
    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);

        String kode15, nama15, dummy15, ruang15;
        int sks15, jumlahJam15;
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        dummy15 = figo.nextLine();
        int jmlMK15 = Integer.parseInt(dummy15);

        MataKuliah15[] arrayOfMataKuliah15 = new MataKuliah15[jmlMK15];
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i+1));
            System.out.print("Kode      : ");
            kode15 = figo.nextLine();
            System.out.print("Nama      : ");
            nama15 = figo.nextLine();
            System.out.print("Sks       : ");
            dummy15 = figo.nextLine();
            sks15 = Integer.parseInt(dummy15);
            System.out.print("Jumlah Jam: ");
            dummy15 = figo.nextLine();
            jumlahJam15 = Integer.parseInt(dummy15);
            System.out.print("Ruang     : ");
            ruang15 = figo.nextLine();
            System.out.println("----------------------------------");

            arrayOfMataKuliah15[i] = new MataKuliah15(kode15, nama15, sks15, jumlahJam15);

            arrayOfMataKuliah15[i].tambahData15(ruang15);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i+1));
            arrayOfMataKuliah15[i].cetakInfo15();
        }
        figo.close();
    }
}
