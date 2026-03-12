package P5;

public class DataMahasiswa15 {
    Mahasiswa15 data15[];

    DataMahasiswa15(Mahasiswa15[] data15) {
        this.data15 = data15;
    }

    Mahasiswa15 tertinggiUTS15(int l, int r) {
        if (l == r) {
            return data15[l];
        }

        int mid15 = (l + r) / 2;
        Mahasiswa15 ltinggi15 = tertinggiUTS15(l, mid15);
        Mahasiswa15 rtinggi15 = tertinggiUTS15(mid15 + 1, r);

        if (ltinggi15.uts15 > rtinggi15.uts15) {
            return ltinggi15;
        } else {
            return rtinggi15;
        }
    }

    Mahasiswa15 terendahUTS15(int l, int r) {
        if (l == r) {
            return data15[l];
        }

        int mid15 = (l + r) / 2;
        Mahasiswa15 lrendah15 = terendahUTS15(l, mid15);
        Mahasiswa15 rrendah15 = terendahUTS15(mid15 + 1, r);

        if (lrendah15.uts15 < rrendah15.uts15) {
            return lrendah15;
        } else {
            return rrendah15;
        }
    }

    double rataUAS15() {
        double total15 = 0;
        for (int i = 0; i < data15.length; i++) {
            total15 = total15 + data15[i].uas15;
        }
        return total15 / data15.length;
    }
}
