public class SLLAntrian {
    NodeAntrian head, tail; 
    int counter = 1; // Angka yang otomatis nambah untuk cetak nomor antrean
    public boolean isEmpty() {
        return head == null;
    }

    public void enqueue(Pembeli p) {
        NodeAntrian newNode = new NodeAntrian(p, counter++, null); 
        
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            // Kalau udah ada orang, orang paling belakang (tail lama) menunjuk ke orang baru
            tail.next = newNode;
            // Sekarang, orang baru itu resmi jadi tail (paling belakang)
            tail = newNode; 
        }
    }

    // METHOD HAPUS ANTRIAN (Keluar dari depan / head untuk ke kasir)
    public NodeAntrian dequeue()  {
        if (isEmpty()) {
            System.out.println("Antrian masih kosong!");
            return null;
        }
        
        // Simpan orang yang ada di paling depan buat dikembalikan datanya
        NodeAntrian removed = head; 
        
        if (head == tail) {
            // Kalau cuma ada 1 orang di antrean, setelah dia keluar antrean jadi kosong
            head = tail = null;
        } else {
            // Kalau lebih dari 1 orang, posisi 'head' digeser ke orang di belakangnya
            head = head.next; 
        }
        return removed; // Lemparkan data orang yang dipanggil ke kasir
    }

    // METHOD CETAK ANTRIAN
    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("===============================================");
        System.out.printf("%-15s %-20s %-15s\n", "No Antrian", "Nama", "No HP");
        
        // Mulai jalan dari head (paling depan)
        NodeAntrian current = head; 
        // Selama gerbongnya ada (tidak null), cetak terus ke belakang
        while (current != null) {
            System.out.printf("%-15d %-20s %-15s\n", current.noAntrian, current.pembeli.namaPembeli, current.pembeli.noHp);
            current = current.next; // Lanjut ke orang berikutnya
        }
    }
}