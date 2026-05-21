package CM2;

public class DLLAntrian15 {
    NodeAntrian15 head;
    NodeAntrian15 tail;
    int nomor = 1;

    boolean isEmpty() {
        return head == null;
    }

    public void addAntrian(Pembeli15 pembeli) {
        NodeAntrian15 newNode = new NodeAntrian15(null, nomor, pembeli, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }

        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + nomor);
        nomor++;
    }

    public void printAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        NodeAntrian15 current = head;

        System.out.println("======================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("======================");
        System.out.printf("%-10s %-20s %-15s\n", "No Antrian", "Nama", "No HP");

        while (current != null) {
            System.out.printf("%-10s %-20s %-15s\n", current.noAntrian, current.pembeli.namaPembeli, current.pembeli.noHp);
            current = current.next;
        }
    }

    public NodeAntrian15 removeAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        NodeAntrian15 temp = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        return temp;
    }
}
