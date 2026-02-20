package P1;

public class Fungtion {

    static int[] harga15 = {75000, 50000, 60000, 10000};

    static String[] bunga15 = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

    static int[][] stok15 = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}};

    static int hitungPendapatan15(int cabang15) {
        int total15 = 0;
        for (int i = 0; i < stok15[cabang15].length; i++) {
            total15 += stok15[cabang15][i] * harga15[i];
        }
        return total15;
    }

    static void tampilkanLaporan() {
        for (int i = 0; i < stok15.length; i++) {

            int pendapatan15 = hitungPendapatan15(i);

            System.out.println("RoyalGarden " + (i + 1));
            System.out.println("Pendapatan: Rp " + pendapatan15);

            if (pendapatan15 > 1500000) {
                System.out.println("Status: Sangat Baik");
            } else {
                System.out.println("Status: Perlu Evaluasi");
            }
        }
    }

    public static void main(String[] args) {
        tampilkanLaporan();
    }
}

