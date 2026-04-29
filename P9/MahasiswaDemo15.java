package P9;

import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);
        int pilih;

        StackTugasMahasiswa15 stack = new StackTugasMahasiswa15(5);

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Melihat Tugas Terbawah");
            System.out.println("6. Melihat Jumlah Tugas");
            System.out.print("Pilih: ");
            pilih = figo.nextInt();
            figo.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = figo.nextLine();
                    System.out.print("NIM: ");
                    String nim = figo.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = figo.nextLine();
                    Mahasiswa15 mhs = new Mahasiswa15(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa15 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = figo.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.println("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa15 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa15 bawah = stack.lihatBawah();
                    if (bawah != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + bawah.nama);
                    }
                    break;
                case 6:
                    System.out.println("Jumlah tugas saaat ini: " + stack.jumlahTugas());
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilih >= 1 && pilih <= 6);
        figo.close();
    }
}
