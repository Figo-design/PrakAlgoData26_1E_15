package P11;

public class QueueLinkedList15 {
    NodeMahasiswa15 front;
    NodeMahasiswa15 rear;
    int size;

    public QueueLinkedList15() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false;
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian berhasil dikosongkan");
    }

    public void enqueue(Mahasiswa15 data) {
        NodeMahasiswa15 node = new NodeMahasiswa15(data, null);
        if (isEmpty()) {
            front = rear = node;
        } else {
            rear.next = node;
            rear = node;
        }
        size++;
        System.out.println(data.nama + " masuk ke antrian");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }
        System.out.println("Melayani mahasiswa: ");
        front.data.tampilkanData();

        front = front.next;
        size--;

        if (front == null) {
            rear = null;
        }
    }

    public void lihatTerdepan() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Antrian terdepan: ");
            front.data.tampilkanData();
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
        } else {
            System.out.println("Antrian paling belakang: ");
            rear.data.tampilkanData();
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong");
            return;
        }

        NodeMahasiswa15 temp = front;
        System.out.println("Daftar antrian mahasiswa:");
        System.out.printf("%-10s %-12s %-5s %-5s", "Nama", "NIM", "Kelas", "IPK");
        System.out.println();
        while (temp != null) {
            temp.data.tampilkanData();
            temp = temp.next;
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }
}
