public class NodeAntrian {
    Pembeli pembeli; // Menyimpan data orangnya
    int noAntrian;   // Menyimpan nomor antreannya
    NodeAntrian next; // Tali penunjuk ke orang di belakangnya

    public NodeAntrian(Pembeli pembeli, int noAntrian, NodeAntrian next) {
        this.pembeli = pembeli;
        this.noAntrian = noAntrian;
        this.next = next;
    }
}

