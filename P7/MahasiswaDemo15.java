package P7;

import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);

        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jumMhs = figo.nextInt();
        figo.nextLine();
        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15();
        list.listMhs = new Mahasiswa15[jumMhs];

        // MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15();
        // int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("Masukkan Data Mahasiswa ke-" + (i + 1));
            System.out.print("NIM   : ");
            String nim = figo.nextLine();
            System.out.print("Nama  : ");
            String nama = figo.nextLine();
            System.out.print("Kelas : ");
            String kelas = figo.nextLine();
            System.out.print("IPK   : ");
            String ip = figo.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("----------------------------------");
            list.tambah (new Mahasiswa15(nim, nama, kelas, ipk));
        }

            // list.tampil();
            // System.out.println("----------------------------------");
            // System.out.println("Pencarian data");
            // System.out.println("----------------------------------");
            // System.out.println("Masukkan ipk mahasiswa yang dicari: ");
            // System.out.print("IPK: ");
            // String cariIpk = figo.nextLine();
            // double cari = Double.parseDouble(cariIpk);

            // System.out.println("Menggunakan sequential searching");
            // double posisi = list.sequentialSearching(cari);
            // int pss = (int)posisi;
            // list.tampilPosisi(cari, pss);
            // list.tampilDataSearch(cari, pss);

            list.tampil();
            System.out.println("----------------------------------");
            System.out.println("Pencarian data");
            System.out.println("----------------------------------");
            System.out.println("Masukkan ipk mahasiswa yang dicari: ");
            System.out.print("IPK: ");
            String cariIpk = figo.nextLine();
            double cari = Double.parseDouble(cariIpk);

            System.out.println("----------------------------------");
            System.out.println("Menggunakan binary search");
            System.out.println("----------------------------------");
            double posisi2 = list.findBinarySearch(cari, 0, jumMhs - 1);
            int pss2 = (int)posisi2;
            list.tampilPosisi(cari, pss2);
            list.tampilDataSearch(cari, pss2);

        figo.close();
    }
}
