package CM2;

public class NodeAntrian15 {
    int noAntrian;
    Pembeli15 pembeli;
    NodeAntrian15 prev, next;

    NodeAntrian15(NodeAntrian15 prev, int noAntrian, Pembeli15 pembeli, NodeAntrian15 next) {
        this.prev = prev;
        this.noAntrian = noAntrian;
        this.pembeli = pembeli;
        this.next = next;
    }
}
