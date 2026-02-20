package P1;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

        Scanner figo = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("    Program Menghitung IP Semester    ");
        System.out.println("======================================");

        String[] mk15 = { "Pancasila", "Konsep Teknologi Informasi", "Critical thinking dan problem solving",
                "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman",
                "Praktikum Dasar Pemrogaman", "Keselamatan dan Kesehatan Kerja"};

        int[] sks15 = { 2, 2, 2,
                3, 2, 2,
                3, 2};

        double[] nilaiAngka15 = new double[mk15.length];
        String[] nilaiHuruf15 = new String[mk15.length];
        double[] nilaiSetara15 = new double[mk15.length];

        double totalBobot15 = 0;
        int totalSKS15 = 0;

        for (int i = 0; i < mk15.length; i++) {

            System.out.print("Masukkan nilai angka untuk MK " + mk15[i] + ": ");
            nilaiAngka15[i] = figo.nextDouble();
            figo.nextLine();

            if (nilaiAngka15[i] > 80) {
                nilaiHuruf15[i] = "A";
                nilaiSetara15[i] = 4;
            } else if (nilaiAngka15[i] > 73) {
                nilaiHuruf15[i] = "B+";
                nilaiSetara15[i] = 3.5;
            } else if (nilaiAngka15[i] > 65) {
                nilaiHuruf15[i] = "B";
                nilaiSetara15[i] = 3;
            } else if (nilaiAngka15[i] > 60) {
                nilaiHuruf15[i] = "C+";
                nilaiSetara15[i] = 2.5;
            } else if (nilaiAngka15[i] > 50) {
                nilaiHuruf15[i] = "C";
                nilaiSetara15[i] = 2;
            } else if (nilaiAngka15[i] > 39) {
                nilaiHuruf15[i] = "D";
                nilaiSetara15[i] = 1;
            } else {
                nilaiHuruf15[i] = "E";
                nilaiSetara15[i] = 0;
            }

            totalBobot15 += nilaiSetara15[i] * sks15[i];
            totalSKS15 += sks15[i];
        }

        double ip15 = totalBobot15 / totalSKS15;

        System.out.println("======================================");
        System.out.println("           Hasil Konversi Nilai       ");
        System.out.println("======================================");
        System.out.printf("%-40s %-15s %-15s %-15s\n", 
                "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < mk15.length; i++) {
            System.out.printf("%-40s %-15.2f %-15s %-15.2f\n",
                mk15[i], nilaiAngka15[i], nilaiHuruf15[i], nilaiSetara15[i] * sks15[i]);
        }

        System.out.println("=====================================");
        System.out.printf("IP Semester : %.2f", ip15);

        figo.close();
    }
}
