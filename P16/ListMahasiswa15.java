package P16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa15 {
    List<Mahasiswa15> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa15... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa15 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.stream().forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    int linearSearch(String nim) {
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }
        return -1;
    }

    public int binarySearch(String nim) {
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));
        return Collections.binarySearch(mahasiswas, new Mahasiswa15(nim, "", ""), Comparator.comparing(m -> m.nim));
    }

    public void sortingAscending() {
        Collections.sort(mahasiswas, Comparator.comparing(m -> m.nim));
    }

    public void sortingDescending() {
        Collections.sort(mahasiswas, Comparator.comparing((Mahasiswa15 m) -> m.nim).reversed());
    }

    public static void main(String[] args) {
        ListMahasiswa15 lm = new ListMahasiswa15();

        Mahasiswa15 m = new Mahasiswa15("201234", "Noureen", "021xx1");
        Mahasiswa15 m1 = new Mahasiswa15("201235", "Akhleema", "021xx2");
        Mahasiswa15 m2 = new Mahasiswa15("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        lm.tampil();

        lm.update(lm.binarySearch("201235"), new Mahasiswa15("201235", "Akhleema Lela", "021xx2"));
        System.out.println();

        lm.tampil();

        System.out.println();
        lm.sortingAscending();
        lm.tampil();

        System.out.println();
        lm.sortingDescending();
        lm.tampil();
    }
}
