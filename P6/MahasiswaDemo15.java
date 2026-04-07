import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        // MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15();
        // Mahasiswa15 m1 = new Mahasiswa15("123", "Zidan", "2A", 3.2);
        // Mahasiswa15 m2 = new Mahasiswa15("124", "Ayu", "2A", 3.5);
        // Mahasiswa15 m3 = new Mahasiswa15("125", "Sofi", "2A", 3.1);
        // Mahasiswa15 m4 = new Mahasiswa15("126", "Sita", "2A", 3.9);
        // Mahasiswa15 m5 = new Mahasiswa15("127", "Miki", "2A", 3.7);

        // list.tambah(m1);
        // list.tambah(m2);
        // list.tambah(m3);
        // list.tambah(m4);
        // list.tambah(m5);

        Scanner figo = new Scanner(System.in);
        String dummy;
        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15();

        System.out.print("Masukkan jumlah mahasiswa: ");
        dummy = figo.nextLine();
        int jml = Integer.parseInt(dummy);

        list.listMhs = new Mahasiswa15[jml];

        for (int i = 0; i < jml; i++) {
            System.out.println("Data mahasiswa ke-" + (i+1));

            System.out.print("Nama  : ");
            String nama = figo.nextLine();

            System.out.print("NIM   : ");
            String nim = figo.nextLine();

            System.out.print("IPK   : ");
            dummy = figo.nextLine();
            double ipk = Double.parseDouble(dummy);

            System.out.print("Kelas : ");
            String kelas = figo.nextLine();

            Mahasiswa15 m = new Mahasiswa15(nim, nama, kelas, ipk);
            list.tambah(m);
        }

        figo.close();

        // System.out.println("\nData mahasiswa sebelum sorting: ");
        // list.tampil();

        // System.out.println("\nData mahasiswa setelah sorting berdasarkan IPK (DESC): ");
        // list.bubbleSort();
        // list.tampil();

        // System.out.println("\nData yang sudah teurut menggunkan SELECTION SORT (ASC): ");
        // list.selectionSort();
        // list.tampil();

        System.out.println("\nData yang sudah terurut menggunakan INSERTION SORT (DSC): ");
        list.insertionSort();
        list.tampil();
    }
}
