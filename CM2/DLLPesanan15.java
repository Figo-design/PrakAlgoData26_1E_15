package CM2;

public class DLLPesanan15 {
    NodePesanan15 head;
    NodePesanan15 tail;

    boolean isEmpty() {
        return head == null;
    }

    public void addPesanan(Pesanan15 pesanan) {
        NodePesanan15 newNode = new NodePesanan15(null, pesanan, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void sortPesanan() {
        if (head == null) {
            return;
        }

        NodePesanan15 i, j;
        for (i = head; i.next != null; i = i.next) {
            for (j = head; j.next != null; j = j.next) {
                if (j.pesanan.namaPesanan.compareToIgnoreCase(j.next.pesanan.namaPesanan) > 0) {
                    Pesanan15 temp = j.pesanan;
                    j.pesanan = j.next.pesanan;
                    j.next.pesanan = temp;
                }
            }
        }
    }

    public void printPesanan() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan!");
            return;
        }

        sortPesanan();
        NodePesanan15 current = head;
        int total = 0;

        System.out.println("===================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("===================================");
        System.out.printf("%-10s %-20s %-10s\n", "Kode", "Nama Pesanan", "Harga");

        while (current != null) {
            System.out.printf("%-10s %-20s %-10s\n", current.pesanan.kodePesanan, current.pesanan.namaPesanan, current.pesanan.harga);
            total += current.pesanan.harga;
            current = current.next;
        }

        System.out.println("===================================");
        System.out.println("Total Pendapatan: " + total);
    }
}
