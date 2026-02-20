package P1;

import java.util.Scanner;

public class Selection {
    public static void main(String[] args) {
        
        Scanner figo = new Scanner(System.in);

        double ntugas15, nkuis15, nuts15, nuas15;

        System.out.println("\nProgram Menghitung Nilai AKhir");
        System.out.println("===============================");

        System.out.print("Masukkan nilai tugas: ");
        ntugas15 = figo.nextDouble();

        System.out.print("Masukkan nilai kuis: ");
        nkuis15 = figo.nextDouble();

        System.out.print("Masukkan nilai UTS: ");
        nuts15 = figo.nextDouble();

        System.out.print("Masukkan nilai UAS: ");
        nuas15 = figo.nextDouble();

        System.out.println("===============================");
        System.out.println("===============================");

        if (ntugas15 < 0 || ntugas15 > 100 || nkuis15 < 0 || nkuis15 > 100 ||
            nuts15 < 0 || nuts15 > 100 || nuas15 < 0 || nuas15 > 100) {

            System.out.println("nilai tidak valid");
            System.out.println("===============================");
            System.out.println("===============================");

        } else {
            double nilaiAkhir15 = (0.2 * ntugas15) + (0.2 * nkuis15) + (0.3 * nuts15) + (0.3 * nuas15);

            String nilaiHuruf15;
            String status15;

            if (nilaiAkhir15 > 80) {
                nilaiHuruf15 = "A";
            } else if (nilaiAkhir15 > 73) {
                nilaiHuruf15 = "B+";
            } else if (nilaiAkhir15 > 65) {
                nilaiHuruf15 = "B";
            } else if (nilaiAkhir15 > 60) {
                nilaiHuruf15 = "C+";
            } else if (nilaiAkhir15 > 50) {
                nilaiHuruf15 = "C";
            } else if (nilaiAkhir15 > 39) {
                nilaiHuruf15 = "D";
            } else {
                nilaiHuruf15 = "E";
            }

            if (nilaiHuruf15.equals("A") || nilaiHuruf15.equals("B+") ||
                nilaiHuruf15.equals("B") || nilaiHuruf15.equals("C+") ||
                nilaiHuruf15.equals("C")) {
                status15 = "SELAMAT ANDA LULUS";
            } else {
                status15 = "MAAF ANDA TIDAK LULUS";
            }

            System.out.println("Nilai Akhir  : " + nilaiAkhir15);
            System.out.println("Nilai Huruf  : " + nilaiHuruf15);
            System.out.println("===============================");
            System.out.println("===============================");
            System.out.println(status15);
        }

        figo.close();
    }
}
