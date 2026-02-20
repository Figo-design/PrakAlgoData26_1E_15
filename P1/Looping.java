package P1;

import java.util.Scanner;

public class Looping {

    public static void main(String[] args) {

        Scanner figo = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        String nim15 = figo.nextLine();

        int panjang15 = nim15.length();
        int n15 = Integer.parseInt(nim15.substring(panjang15 - 2));

        if (n15 < 10) {
            n15 += 10;
        }

        System.out.println("n = " + n15);
        System.out.print("Output: ");

        for (int i = 1; i <= n15; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("# ");
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

        figo.close();
    }
}
