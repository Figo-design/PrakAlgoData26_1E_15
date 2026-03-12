package P5;

import java.util.Scanner;

public class MainSum15 {
    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen15 = figo.nextInt();

        Sum15 sm15 = new Sum15(elemen15);
        for (int i = 0; i < elemen15; i++) {
            System.out.print("Masukkan keuntungan ke-" + (i+1) + ": ");
            sm15.keuntungan15[i] = figo.nextDouble();
        }

        System.out.println("Total keuntungan menggunakan Bruteforce: " + sm15.totalBF15());
        System.out.println("Total keuntungan menggunakan Divide and Conquer: " + sm15.totalDC15(sm15.keuntungan15, 0, elemen15 - 1));

        figo.close();
    }
}
