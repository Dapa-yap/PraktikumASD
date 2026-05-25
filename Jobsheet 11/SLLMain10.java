public class SLLMain10 {
    public static void main(String[] args) {
        SingleLinkedList10 sll = new SingleLinkedList10();
        Mahasiswa10 mhs1 = new Mahasiswa10("111", "Andi", "1A", 3.8);
        Mahasiswa10 mhs2 = new Mahasiswa10("112", "Budi", "1B", 3.5);
        Mahasiswa10 mhs3 = new Mahasiswa10("113", "Cita", "1A", 3.9);
        Mahasiswa10 mhs4 = new Mahasiswa10("114", "Doni", "1C", 3.7);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addFirst(mhs1);
        sll.print();
        sll.insertAfter("Andi", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}
