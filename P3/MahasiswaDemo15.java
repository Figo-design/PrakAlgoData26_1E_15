package P3;

import java.util.Scanner;

public class MahasiswaDemo15 {
    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);
        Mahasiswa15[] arrayOfMahasiswa = new Mahasiswa15[3];
        String dummy15;

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa15();

            System.out.println("Masukkan Data Mahasiswa ke-" + (i+1));
            System.out.print("NIM   : ");
            arrayOfMahasiswa[i].nim15 = figo.nextLine();
            System.out.print("Nama  : ");
            arrayOfMahasiswa[i].nama15 = figo.nextLine();
            System.out.print("Kelas : ");
            arrayOfMahasiswa[i].kelas15 = figo.nextLine();
            System.out.print("IPK   : ");
            dummy15 = figo.nextLine();
            arrayOfMahasiswa[i].ipk15 = Float.parseFloat(dummy15);
            System.out.println("---------------------------------");
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Mahasiswa ke-" + (i+1));
            arrayOfMahasiswa[i].cetakInfo15();
        }

        figo.close();;
    }
}
