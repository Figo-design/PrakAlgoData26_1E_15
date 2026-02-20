package P1;

import java.util.Scanner;

public class Plat {
    public static void main(String[] args) {

        char[] kode15 = { 'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T' };

        char[][] kota15 = {
                { 'B', 'A', 'N', 'T', 'E', 'N' },
                { 'J', 'A', 'K', 'A', 'R', 'T', 'A' },
                { 'B', 'A', 'N', 'D', 'U', 'N', 'G' },
                { 'C', 'I', 'R', 'E', 'B', 'O', 'N' },
                { 'B', 'O', 'G', 'O', 'R' },
                { 'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N' },
                { 'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G' },
                { 'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A' },
                { 'M', 'A', 'L', 'A', 'N', 'G' },
                { 'T', 'E', 'G', 'A', 'L' } };

        Scanner figo = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char input15 = figo.next().toUpperCase().charAt(0);

        boolean found15 = false;
        for (int i = 0; i < kode15.length; i++) {
            if (input15 == kode15[i]) {
                System.out.print("Kota untuk kode plat " + input15 + " adalah ");
                for (int j = 0; j < kota15[i].length; j++) {
                    System.out.print(kota15[i][j]);
                }
                found15 = true;
                break;
            }
        }
        if (!found15) {
            System.out.println("Kode plat tidak ditemukan!");
        }
        figo.close();
    }
}
