package P11;

import java.util.Scanner;

public class SLLMain15 {
    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);
        SingleLinkedList15 sll = new SingleLinkedList15();

        Mahasiswa15 mhs1 = new Mahasiswa15("Alvaro","24212200", "1A", 4.0);
        Mahasiswa15 mhs2 = new Mahasiswa15("Cintia", "22212201", "3C", 3.5);
        Mahasiswa15 mhs3 = new Mahasiswa15("Bimon", "23212201", "2B", 3.8);
        Mahasiswa15 mhs4 = new Mahasiswa15("Dirga", "21212203", "4D", 3.6);

        // sll.print();
        // sll.addFirst(mhs4);
        // sll.print();
        // sll.addLast(mhs1);
        // sll.print();
        // sll.insertAfter("Dirga", mhs2);
        // sll.insertAt(2, mhs3);
        // sll.print();

        // for (int i = 0; i < 4; i++) {
        //     System.out.println("\nData Mahasiswa ke-" + (i + 1));
        //     System.out.print("Nama  : ");
        //     String nama = figo.nextLine();
        //     System.out.print("NIM   : ");
        //     String nim = figo.nextLine();   
        //     System.out.print("Kelas : ");
        //     String kelas = figo.nextLine();
        //     System.out.print("IPK   : ");
        //     String ipkStr = figo.nextLine();
        //     double ipk = Double.parseDouble(ipkStr);

        //     Mahasiswa15 mhs = new Mahasiswa15(nim, nama, kelas, ipk);
        //     sll.addFirst(mhs);
        // }
        // System.out.println();
        // sll.print();

        sll.addLast(mhs1);
        sll.addLast(mhs2);
        sll.addLast(mhs3);
        sll.addLast(mhs4);

        System.out.println("Data index 1: ");
        sll.getData(1);

        System.out.println("Data mahasiswa an Bimon pada index: " + sll.indexOf("bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();

        figo.close();
    }    
}
