package P10;

public class AntrianKRS15 {
    Mahasiswa15[] data;
    int front, rear, size, max;
    int sudahDiproses = 0;

    public AntrianKRS15(int max) {
        this.max = max;
        data = new Mahasiswa15[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Antrian berhasil dikosongkan");
        } else {
            System.out.println("Antrian sudah kosong!");
        }
    }

    public void enqueue(Mahasiswa15 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }

        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }

        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " masuk antrian.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2!");
            return;
        }

        for (int i = 0; i < 2; i++) {
            Mahasiswa15 mhs = data[front];
            System.out.print("Melayani: ");
            mhs.tampilkanData();

            front = (front + 1) % max;
            size--;
            sudahDiproses++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }

        int i = front;
        int no = 1;
        System.out.println("Daftar Mahasiswa dalam Antrian:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        while (true) {
            System.out.print(no + ". ");
            data[i].tampilkanData();
            if (i == rear) break;
            i = (i + 1) % max;
            no++;
        }
    }

    public void tampil2Terdepan() {
        if (size == 0) {
            System.out.println("Antrian kosong!");
        } else if (size == 1) {
            System.out.println("Antrian terdepan:");
            data[front].tampilkanData();
        } else {
            int i = front;
            System.out.println("Antrian 2 terdepan:");
            for (int j = 0; j < 2; j++) {
                data[i].tampilkanData();
                i = (i + 1) % max;
            }
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            data[rear].tampilkanData();
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }

    public void jumlahDiproses() {
        System.out.println("KRS yang sudah diproses: " + sudahDiproses);
    }

    public void belumKRS() {
        int total = 30;
        System.out.println("Mahasiswa Belum KRS: " + (total - sudahDiproses));
    }
}
