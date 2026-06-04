package P14;

public class BinaryTreeArray15 {
    Mahasiswa15[] dataMahasiswa;
    int idxLast;

    public BinaryTreeArray15() {
        this.dataMahasiswa = new Mahasiswa15[10];
    }

    void populateData(Mahasiswa15 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    void add(Mahasiswa15 data) {
        if (idxLast + 1 >= dataMahasiswa.length) {
            System.out.println("Array penuh!");
            return;
        }
        idxLast++;
        dataMahasiswa[idxLast] = data;
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}
