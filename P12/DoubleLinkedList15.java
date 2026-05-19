package P12;

public class DoubleLinkedList15 {
    Node15 head;
    Node15 tail;
    int size;

    public DoubleLinkedList15() {
        head = null;
        tail = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa15 data) {
        Node15 newNode = new Node15(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(Mahasiswa15 data) {
        Node15 newNode = new Node15(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    public void insertAfter(String keyNIM, Mahasiswa15 data) {
        Node15 current = head;
        while (current != null && !current.data.nim.equals(keyNIM)) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Data dengan NIM " + keyNIM + " tidak ditemukan.");
            return;
        }

        Node15 newNode = new Node15(data);

        //Jika current adalah tail, node baru ditambahkan di akhir
        if (current == tail) {
            newNode.prev = current;
            current.next = newNode;
            tail = newNode;
        } else { //node baru disisipkan di tengah
            newNode.prev = current;
            newNode.next = current.next;
            current.next.prev = newNode;
            current.next = newNode;
        }
        System.out.println("Data berhasil disisipkan setelah NIM "  + keyNIM);
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node15 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        } 
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Lisked List kosong.");
            return;
        }

        Mahasiswa15 datarm = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        System.out.println("Data berhasil dihapus.");
        datarm.tampil();
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong.");
            return;
        }

        Mahasiswa15 datarm = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        System.out.println("Data berhasil dihapus.");
        datarm.tampil();
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node15 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void add(int index, Mahasiswa15 data) {
        if (index < 0 || index > size) {
            System.out.println("Index di luar batas");
            return;
        }

        if (index == 0) {
            addFirst(data);
            return;
        }

        if (index == size) {
            addLast(data);
            return;
        }

        Node15 current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        Node15 newNode = new Node15(data);
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
    }

    public void removeAfter(String keyNim) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node15 current = head;
        while(current != null && !current.data.nim.equals(keyNim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }

        if (current.next == null) {
            System.out.println("Tidak ada node setelah data tersebut");
            return;
        }

        Node15 rm = current.next;
        if (rm == tail) {
            tail = current;
            tail.next = null;
        } else {
            current.next = rm.next;
            rm.next.prev = current;
        }

        System.out.println("Data berhasil dihapus: ");
        rm.data.tampil();
        size--;
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index di luar batas");
            return;
        }

        if (index == 0) {
            removeFirst();
            return;
        }

        if (index == size - 1) {
            removeLast();
            return;
        }

        Node15 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;
        size--;
    }

    public void getFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }
        System.out.println("Data pertama: ");
        head.data.tampil();
    }

    public void getLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }
        System.out.println("Data terakhir: ");
        tail.data.tampil();
    }

    public void getIndex(int index) {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        if (index < 0 || index >= size) {
            System.out.println("Index di luar batas");
            return;
        }

        Node15 current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        System.out.println("Data pada index " + index + ": ");
        current.data.tampil();
    }

    public int size() {
        return size;
    }
}
