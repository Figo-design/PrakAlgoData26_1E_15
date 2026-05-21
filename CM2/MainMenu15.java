package CM2;

import java.util.Scanner;

public class MainMenu15 {
    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);

        DLLAntrian15 antrian = new DLLAntrian15();
        DLLPesanan15 pesanan = new DLLPesanan15();
        int pilih;

        do {
            System.out.println("\n===========================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("===========================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = figo.nextInt();
            figo.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pembeli: ");
                    String nama = figo.nextLine();
                    System.out.print("No HP       : ");
                    String noHp = figo.nextLine();

                    Pembeli15 pembeli = new Pembeli15(nama, noHp);
                    antrian.addAntrian(pembeli);
                    break;
                
                case 2:
                    antrian.printAntrian();;
                    break;

                case 3:
                    NodeAntrian15 data = antrian.removeAntrian();

                    if (data != null) {
                        System.out.println("Input Pesanan");
                        System.out.print("Kode Pesanan: ");
                        int kode = figo.nextInt();
                        figo.nextLine();
                        System.out.print("Nama Pesanan: ");
                        String namaPesanan = figo.nextLine();
                        System.out.print("Harga       : ");
                        int harga = figo.nextInt();
                        figo.nextLine();

                        Pesanan15 p = new Pesanan15(kode, namaPesanan, harga);
                        pesanan.addPesanan(p);
                        System.out.println(data.pembeli.namaPembeli + " telah memesan " + namaPesanan);
                    }
                    break;

                case 4:
                    pesanan.printPesanan();
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;
                
                default:
                    System.out.println("Menu tidak valid!");
            }
        } while (pilih != 0);
        figo.close();
    }
}
