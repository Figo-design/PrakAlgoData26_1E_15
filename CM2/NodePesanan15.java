package CM2;

public class NodePesanan15 {
    Pesanan15 pesanan;
    NodePesanan15 prev, next;

    NodePesanan15(NodePesanan15 prev, Pesanan15 pesanan, NodePesanan15 next) {
        this.prev = prev;
        this.pesanan = pesanan;
        this.next = next;
    }
}
