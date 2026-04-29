package P9;

import java.util.Scanner;

public class SuratDemo15 {
    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);
        StackSurat15 stack = new StackSurat15(5);

        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = figo.nextInt();
            figo.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = figo.nextLine();
                    System.out.print("Nama: ");
                    String nama = figo.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = figo.nextLine();
                    System.out.print("Jenis Izin: ");
                    char jenis = figo.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = figo.nextInt();
                    figo.nextLine();

                    Surat15 s = new Surat15(id, nama, kelas, jenis, durasi);
                    stack.push(s);
                    System.out.println("Surat berhasil ditambahkan");
                    break;

                case 2:
                    Surat15 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat dari " + proses.namaMahasiswa);
                    }
                    break;
                
                case 3:
                    Surat15 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir dari " + lihat.namaMahasiswa);
                    } else {
                        System.out.println("Stack kosong!");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama yang dicari: ");
                    String cari = figo.nextLine();
                    stack.cariSurat(cari);
                    break;
                    
                case 0:
                    System.out.println("Keluar...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } while (pilih != 0);
        figo.close();
    }
}
