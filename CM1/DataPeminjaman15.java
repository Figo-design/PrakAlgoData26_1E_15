package CM1;

public class DataPeminjaman15 {
    //DATA SEMUA MAHASISWA
    Mahasiswa15[] mhs = {
        new Mahasiswa15("22001", "Andi", "Teknik Informatika"),
        new Mahasiswa15("22002", "Budi", "Teknik Informatika"),
        new Mahasiswa15("22003", "Citra", "Sistem Informasi Bisnis")
    };

    //DATA SEMUA BUKU
    Buku15[] buku = {
        new Buku15("B001", "Algoritma", 2020),
        new Buku15("B002", "Basis Data", 2019),
        new Buku15("B003", "Pemrograman", 2021),
        new Buku15("B004", "Fisika", 2024)
    };

    //DATA SEMUA PEMINJAMAN
    Peminjaman15[] pj = {
        new Peminjaman15(mhs[0], buku[0], 7),
        new Peminjaman15(mhs[1], buku[1], 3),
        new Peminjaman15(mhs[2], buku[2], 10),
        new Peminjaman15(mhs[2], buku[3], 6),
        new Peminjaman15(mhs[0], buku[1], 4)
    };
    
    //MENAMPILKAN DATA MAHASISWA
    void tampilMahasiswa() {
        for (Mahasiswa15 mahasiswa15 : mhs) {
            mahasiswa15.tampilMahasiswa();
        }
    }

    //MENAMPILKAN DATA BUKU
    void tampilBuku() {
        for (Buku15 buku15 : buku) {
            buku15.tampilBuku();
        }
    }

    //MENAMPILKAN DATA PEMINJAMAN
    void tampilPeminjaman() {
        for (Peminjaman15 pj15 : pj) {
            pj15.hitungDenda();
            pj15.tampilPeminjaman();
        }
    }

    //SORTING DENDA DENGAN INSERTION SORT (DSC)
    void sortingDenda() {
        for (int i = 1; i < pj.length; i++) {
            Peminjaman15 temp = pj[i];
            int j=i;
            while (j > 0 && pj[j-1].denda < temp.denda){
                pj[j] = pj[j-1];
                j--;
            }
            pj[j] = temp;
        }
    }

    //MENCARI DATA PEMINJAMAN BERDASARKAN NIM
    int findBinarySearch(String cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari.equals(mhs[mid].nim)) {
                return (mid);
            } else if (mhs[mid].nim.compareTo(cari) > 0) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    //MENAMPILKAN HASIL PENCARIAN
    void tampilDataSearch(int posisi, String cari) {
        if (posisi != -1) {
            for (Peminjaman15 peminjaman : pj) {
                if (peminjaman.mhs == mhs[posisi]) {
                    peminjaman.hitungDenda();
                    peminjaman.tampilPeminjaman();
                }
            }
        } else {
            System.out.println("Data " + cari + " tidak ditemukan");
        }
    }
}
