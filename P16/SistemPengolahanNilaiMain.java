package P16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SistemPengolahanNilaiMain {

    public static void main(String[] args) {
        Scanner figo = new Scanner(System.in);

        ArrayList<Mahasiswa> daftarMhs = new ArrayList<>();
        ArrayList<MataKuliah> daftarMK = new ArrayList<>();
        ArrayList<Nilai> daftarNilai = new ArrayList<>();
        Queue<Mahasiswa> hapusAntrian = new LinkedList<>();

        daftarMhs.add(new Mahasiswa("20001", "Thalhah", "021xxx"));
        daftarMhs.add(new Mahasiswa("20002", "Zubair", "021xxx"));
        daftarMhs.add(new Mahasiswa("20003", "Abdur-Rahman", "021xxx"));
        daftarMhs.add(new Mahasiswa("20004", "Sa'ad", "021xxx"));
        daftarMhs.add(new Mahasiswa("20005", "Sa'id", "021xxx"));
        daftarMhs.add(new Mahasiswa("20006", "Ubaidah", "021xxx"));

        daftarMK.add(new MataKuliah("00001", "Internet of Things", 3));
        daftarMK.add(new MataKuliah("00002", "Algoritma dan Struktur Data", 2));
        daftarMK.add(new MataKuliah("00003", "Algoritma dan Pemrograman", 2));
        daftarMK.add(new MataKuliah("00004", "Praktikum Algoritma dan Struktur Data", 3));
        daftarMK.add(new MataKuliah("00005", "Praktikum Algoritma dan Pemrograman", 3));

        int pilih;
        do {
            System.out.println("\n=================================================");
            System.out.println(" SISTEM PENGOLAHAN DATA NILAI MAHASISWA SEMESTER ");
            System.out.println("=================================================");
            System.out.println("1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Cari Nilai Mahasiswa");
            System.out.println("4. Urutkan Nilai");
            System.out.println("5. Hapus Data Mahasiswa");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu : ");
            pilih = figo.nextInt();
            figo.nextLine();

            switch (pilih) {
                case 1:
                    System.out.println("Masukan data");
                    
                    System.out.print("Kode       : ");
                    String kode = figo.nextLine();

                    System.out.print("Nilai      : ");
                    double nilai = figo.nextDouble();
                    figo.nextLine();
                    
                    System.out.println("\nDAFTAR MAHASISWA");
                    System.out.println("================================================================");
                    System.out.printf("%-12s %-20s %s\n", "NIM", "Nama", "Telf");
                    for (Mahasiswa m : daftarMhs) {
                        System.out.printf("%-12s %-20s %s\n", m.getNim(), m.getNama(), m.getNoTelp());
                    }

                    System.out.print("Pilih mahasiswa by nim: ");
                    String nim = figo.nextLine();

                    Mahasiswa mhsDipilih = null;
                    for (Mahasiswa m : daftarMhs) {
                        if (m.getNim().equals(nim)) {
                            mhsDipilih = m;
                            break;
                        }
                    }

                    if (mhsDipilih == null) {
                        System.out.println("Mahasiswa tidak ditemukan!");
                        break;
                    }

                    System.out.println("\nDAFTAR MATA KULIAH");
                    System.out.println("================================================================");
                    System.out.printf("%-12s %-40s %s\n", "Kode", "Mata Kuliah", "SKS");
                    for (MataKuliah mk : daftarMK) {
                        System.out.printf("%-12s %-40s %d\n", mk.getKodeMK(), mk.getNamaMK(), mk.getSks());
                    }

                    System.out.print("Pilih MK by kode: ");
                    String kodeMK = figo.nextLine();

                    MataKuliah mkDipilih = null;
                    for (MataKuliah mk : daftarMK) {
                        if (mk.getKodeMK().equalsIgnoreCase(kodeMK)) {
                            mkDipilih = mk;
                            break;
                        }
                    }

                    if (mkDipilih == null) {
                        System.out.println("Mata kuliah tidak ditemukan!");
                        break;
                    }

                    daftarNilai.add(new Nilai(mhsDipilih, mkDipilih, nilai));
                    break;

                case 2:
                    if (daftarNilai.isEmpty()) {
                        System.out.println("Belum ada data nilai.");
                    } else {
                        System.out.println("\nDAFTAR NILAI MAHASISWA");
                        System.out.println("===========================================================");
                        System.out.printf("%-12s %-15s %-40s %-5s %s\n","Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");

                        for (Nilai n : daftarNilai) {
                            System.out.printf("%-12s %-15s %-40s %-5d %.2f\n", 
                                n.getMahasiswa().getNim(), 
                                n.getMahasiswa().getNama(), 
                                n.getMataKuliah().getNamaMK(),
                                n.getMataKuliah().getSks(),
                                n.getNilai());
                        }
                    }
                    break;

                case 3:
                    if (daftarNilai.isEmpty()) {
                        System.out.println("Belum ada data nilai.");
                    } else {
                        System.out.println("\nDAFTAR NILAI MAHASISWA");
                        System.out.println("============================================================");
                        System.out.printf("%-12s %-15s %-40s %-5s %s\n","Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");

                        for (Nilai n : daftarNilai) {
                            System.out.printf("%-12s %-15s %-40s %-5d %.2f\n", 
                                n.getMahasiswa().getNim(), 
                                n.getMahasiswa().getNama(), 
                                n.getMataKuliah().getNamaMK(),
                                n.getMataKuliah().getSks(),
                                n.getNilai());
                        }
                    }
                    
                    System.out.print("Masukkan data mahasiswa[nim] : ");
                    String cari = figo.nextLine();

                    boolean found = false;
                    int totalSKS = 0;
                    for (Nilai n : daftarNilai) {
                        if (n.getMahasiswa().getNim().equals(cari)) {
                            if (!found) {
                                System.out.printf("%-12s %-15s %-40s %-5s %s\n","Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");
                            }
                            System.out.printf("%-12s %-15s %-40s %-5d %.2f\n",
                                n.getMahasiswa().getNim(),
                                n.getMahasiswa().getNama(),
                                n.getMataKuliah().getNamaMK(),
                                n.getMataKuliah().getSks(),
                                n.getNilai());
                            totalSKS += n.getMataKuliah().getSks();
                            found = true;
                        }
                    }

                    if (found) {
                        System.out.println("Total SKS " + totalSKS + " telah diambil.");
                    } else {
                        System.out.println("Data tidak ditemukan.");
                    }
                    break;

                case 4:
                    if (daftarNilai.isEmpty()) {
                        System.out.println("Belum ada data nilai.");
                    } else {
                        Collections.sort(daftarNilai, new Comparator<Nilai>() {
                            @Override
                            public int compare(Nilai o1, Nilai o2) {
                                return Double.compare(o1.getNilai(), o2.getNilai());
                            }
                        });
                        System.out.println("\nDAFTAR NILAI MAHASISWA");
                        System.out.println("============================================================");
                        System.out.printf("%-12s %-15s %-40s %-5s %s\n","Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");

                        for (Nilai n : daftarNilai) {
                            System.out.printf("%-12s %-15s %-40s %-5d %.2f\n", 
                                n.getMahasiswa().getNim(), 
                                n.getMahasiswa().getNama(), 
                                n.getMataKuliah().getNamaMK(),
                                n.getMataKuliah().getSks(),
                                n.getNilai());
                        }
                    }
                    break;

                case 5:
                    if (daftarNilai.isEmpty()) {
                        System.out.println("Belum ada data nilai.");
                    } else {
                        System.out.println("\nDAFTAR NILAI MAHASISWA");
                        System.out.println("============================================================");
                        System.out.printf("%-12s %-15s %-40s %-5s %s\n","Nim", "Nama", "Mata Kuliah", "SKS", "Nilai");

                        for (Nilai n : daftarNilai) {
                            System.out.printf("%-12s %-15s %-40s %-5d %.2f\n", 
                                n.getMahasiswa().getNim(), 
                                n.getMahasiswa().getNama(), 
                                n.getMataKuliah().getNamaMK(),
                                n.getMataKuliah().getSks(),
                                n.getNilai());
                        }
                    }
                    
                    System.out.print("Pilih mahasiswa yang akan dihapus by nim : ");
                    String nimHapus = figo.nextLine();

                    Mahasiswa mhsHapus = null;
                    for (Mahasiswa m : daftarMhs) {
                        if (m.getNim().equals(nimHapus)) {
                            mhsHapus = m;
                            break;
                        }
                    }

                    if (mhsHapus == null) {
                        System.out.println("Mahasiswa tidak ditemukan!");
                        break;
                    }

                    hapusAntrian.offer(mhsHapus);
                    Mahasiswa keluar = hapusAntrian.poll();
                    daftarMhs.remove(keluar);
                    daftarNilai.removeIf(n -> n.getMahasiswa().getNim().equals(keluar.getNim()));
                    System.out.println("Data Mahasiswa berhasil dihapus.");
                    break;

                case 6:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Menu tidak valid.");
            }
        } while (pilih != 6);
        figo.close();
    }
}
