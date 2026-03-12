package P5;

public class MainMahasiswa15 {
    public static void main(String[] args) {
        Mahasiswa15[] mhs15 = {
            new Mahasiswa15("Ahmad", "220101001", 2022, 78, 82),
            new Mahasiswa15("Budi", "220101002", 2022, 85, 88),
            new Mahasiswa15("Cindy", "220101003", 2021, 90, 87),
            new Mahasiswa15("Dian", "220101004", 2021, 76, 79),
            new Mahasiswa15("Eko", "220101005", 2023, 92, 95),
            new Mahasiswa15("Fajar", "220101006", 2020, 88, 85),
            new Mahasiswa15("Gina", "220101007", 2023, 80, 83),
            new Mahasiswa15("Hadi", "220101008", 2020, 82, 84)
        };

        DataMahasiswa15 dataMhs15 = new DataMahasiswa15(mhs15);

        Mahasiswa15 tertinggi15 = dataMhs15.tertinggiUTS15(0, mhs15.length - 1);
        Mahasiswa15 terendah15 = dataMhs15.terendahUTS15(0, mhs15.length - 1);

        System.out.println("Nilai UTS Tertinggi: " + tertinggi15.uts15 + " (" + tertinggi15.nama15 + ")");
        System.out.println("Nilai UTS Terendah: " + terendah15.uts15 + " (" + terendah15.nama15 + ")");
        System.out.println("Rata-rata nilai UAS: " + dataMhs15.rataUAS15());
    }
}
