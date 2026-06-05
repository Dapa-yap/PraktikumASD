public class NodePesanan {
    Pesanan pesanan;
    NodePesanan next;

    public NodePesanan(Pesanan pesanan, NodePesanan next) {
        this.pesanan = pesanan;
        this.next = next;
    }
}