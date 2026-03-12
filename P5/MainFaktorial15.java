package P5;

import java.util.Scanner;

public class MainFaktorial15 {
    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);

        System.out.print("Masukkan nilai: ");
        int nilai15 = figo.nextInt();

        Faktorial15 fk15 = new Faktorial15();
        System.out.println("Nilai Faktorial " + nilai15 + " menggunakan BF: " + fk15.faktorialBF15(nilai15));
        System.out.println("Nilai Faktorial " + nilai15 + " menggunakan DC: " + fk15.faktoriaDC15(nilai15));

        figo.close();
    }
}
