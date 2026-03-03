package P3;

import java.util.Scanner;

public class DosenDemo15 {
    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);

        String kode15, nama15, dummy15, jk15;
        boolean jenisKelamin15;
        int usia15; 
        // int counter15;
        
        System.out.print("Masukkan jumlah dosen: ");
        dummy15 = figo.nextLine();
        int jmlDosen15 = Integer.parseInt(dummy15);

        Dosen15[] arrayOfDosen15 = new Dosen15[jmlDosen15];
        
        for (int i = 0; i < arrayOfDosen15.length; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i+1));
            System.out.print("Kode          : ");
            kode15 = figo.nextLine();
            System.out.print("Nama          : ");
            nama15 = figo.nextLine();
            System.out.print("Jenis Kelamin : ");
            jk15 = figo.nextLine();
            if (jk15.equalsIgnoreCase("pria")) {
                jenisKelamin15 = true;
            } else {
                jenisKelamin15 = false;
            }
            System.out.print("Usia          : ");
            dummy15 = figo.nextLine();
            usia15 = Integer.parseInt(dummy15);
            System.out.println("----------------------------------");

            arrayOfDosen15[i] = new Dosen15(kode15, nama15, jenisKelamin15, usia15);
        }

        // counter15 = 1;
        // for (Dosen15 dosen15 : arrayOfDosen15) {
            
        //     System.out.println("Data Dosen ke-" + counter15);
        //     System.out.println("Kode            : " + dosen15.kode15);
        //     System.out.println("Nama            : " + dosen15.nama15);
        //     if (dosen15.jenisKelamin15 == true) {
        //         jk15 = "Pria";
        //     } else {
        //         jk15 = "Wanita";
        //     }
        //     System.out.println("Jenis Kelamin   : " + jk15);
        //     System.out.println("Usia            : " + dosen15.usia15);
        //     System.out.println("---------------------------------");
        //     counter15++;
        // }

        DataDosen15 data15 = new DataDosen15();

        System.out.println("\nData Semua Dosen:");
        data15.dataSemuaDosen15(arrayOfDosen15);

        System.out.println("\nJumlah Dosen Per Jenis Kelamin:");
        data15.jumlahDosenPerJenisKelamin15(arrayOfDosen15);

        System.out.println("\nRata-rata Usia Dosen Per Jenis Kelamin:");
        data15.rerataUsiaDosenPerJenisKelamin15(arrayOfDosen15);

        System.out.println("\nDosen Paling Tua:");
        data15.infoDosenPalingTua15(arrayOfDosen15);

        System.out.println("\nDosen Paling Muda:");
        data15.infoDosenPalingMuda15(arrayOfDosen15);

        figo.close();
    }
}
