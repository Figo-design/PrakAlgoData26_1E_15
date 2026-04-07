import java.util.Scanner;

public class DosenDemo15 {
    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);
        DataDosen15 list = new DataDosen15();
        String dummy;
        int menu;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data");
            System.out.println("3. Sorting ASC");
            System.out.println("4. Sorting DSC");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            menu = figo.nextInt();
            figo.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Masukkan jumlah dosen: ");
                    dummy = figo.nextLine();
                    int jmlDosen = Integer.parseInt(dummy);

                    if (jmlDosen > list.dataDosen.length - list.idx) {
                        System.out.println("Data melebihi kapasitas!");
                        jmlDosen = list.dataDosen.length - list.idx;
                    }

                    for (int i = 0; i < jmlDosen; i++) {
                        System.out.println("\nMasukkan Data Dosen ke-" + (i + 1));

                        System.out.print("Kode          : ");
                        String kd = figo.nextLine();

                        System.out.print("Nama          : ");
                        String nm = figo.nextLine();

                        System.out.print("Jenis Kelamin : ");
                        String inputJK = figo.nextLine();
                        
                        boolean jk;
                        if (inputJK.equalsIgnoreCase("laki-laki")) {
                            jk = true;
                        } else {
                            jk = false;
                        }

                        System.out.print("Usia          : ");
                        dummy = figo.nextLine();
                        int us = Integer.parseInt(dummy);

                        Dosen15 d = new Dosen15(kd, nm, jk, us);
                        list.tambah(d);
                    }
                    break;

                case 2:
                    System.out.println("\nData Dosen: ");
                    list.tampil();
                    break;

                case 3:
                    System.out.println("\nData yang sudah diurutkan (ASC): ");
                    list.sortingASC();
                    list.tampil();
                    break;

                case 4:
                    System.out.println("\nData yang sudah diurutkan (DSC): ");
                    list.sortingDSC();
                    list.tampil();
                    break;

                case 5:
                    System.out.println("Keluar.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (menu != 5);

        figo.close();
    }
}
