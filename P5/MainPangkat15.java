package P5;

import java.util.Scanner;

public class MainPangkat15 {
    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen15 = figo.nextInt();

        Pangkat15[] png15 = new Pangkat15[elemen15];
        for (int i = 0; i < elemen15; i++) {
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
            int basis15 = figo.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat15 = figo.nextInt();
            png15[i] = new Pangkat15(basis15, pangkat15);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE:");
        for (Pangkat15 p15 : png15) {
            System.out.println(p15.nilai15 + "^" + p15.pangkat15 + ": " + p15.pangkatBF15());
        }
        System.out.println("HASIL PANGKAT DIVIDE AND CONQUER:");
        for (Pangkat15 p15 : png15) {
            System.out.println(p15.nilai15 + "^" + p15.pangkat15 + ": " + p15.pangkatDC15(p15.nilai15, p15.pangkat15));
        }

        figo.close();
    }
}
