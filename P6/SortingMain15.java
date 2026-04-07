public class SortingMain15 {
    public static void main(String[] args) {
        // int a[] = { 20, 10, 2, 7, 12 };

        // Sorting15 darurat1 = new Sorting15(a, a.length);
        // System.out.println("Data awal 1");
        // darurat1.tampil();
        // darurat1.bubbleSort();
        // System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        // darurat1.tampil();

        // int b[] = {30, 20, 2, 8, 14};

        // Sorting15 darurat2 = new Sorting15(b, b.length);
        // System.out.println("Data awal 2");
        // darurat2.tampil();
        // darurat2.SelectionSort();
        // System.out.println("Data sudah diurutkan dengan SELECTION SORT (ASC)");
        // darurat2.tampil();

        int c[] = {40, 10, 4, 9, 3};

        Sorting15 darurat3 = new Sorting15(c, c.length);
        System.out.println("Data awal 3");
        darurat3.tampil();
        darurat3.insertionSort();
        System.out.println("Data sudah diurutkan dengan INSERTION SORT (ASC)");
        darurat3.tampil();
    }
}
