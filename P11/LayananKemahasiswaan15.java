package P11;

import java.util.Scanner;

public class LayananKemahasiswaan15 {
    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);
        QueueLinkedList15 qll = new QueueLinkedList15();

        int pilih;
        do {
            System.out.println("\n=== Menu Layanan Unit Kemahasiswaan ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Tampilkan Seluruh Antrian");
            System.out.println("4. Lihat Antrian Terdepan");
            System.out.println("5. Lihat Antrian paling Belakang");
            System.out.println("6. Jumlah Mahasiswa dalam Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = figo.nextInt();
            figo.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama  : ");
                    String nama = figo.nextLine();
                    System.out.print("NIM   : ");
                    String nim = figo.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = figo.nextLine();
                    System.out.print("IPK   : ");
                    String ipkStr = figo.nextLine();
                    double ipk = Double.parseDouble(ipkStr);
                    Mahasiswa15 mhs = new Mahasiswa15(nama, nim, kelas, ipk);
                    qll.enqueue(mhs);
                    break;
                
                case 2:
                    qll.dequeue();
                    break;
                    
                case 3:
                    qll.print();
                    break;

                case 4:
                    qll.lihatTerdepan();
                    break;

                case 5:
                    qll.lihatAkhir();
                    break;

                case 6:
                    qll.jumlahAntrian();
                    break;

                case 7:
                    qll.clear();
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilih != 0);
        figo.close();
    }
}
