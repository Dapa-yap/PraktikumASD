public class SLLPesanan {
    NodePesanan head, tail;

    public boolean isEmpty() {
        return head == null;
    }

    // Tambah pesanan masuk dari belakang
    public void addPesanan(Pesanan p) {
        NodePesanan newNode = new NodePesanan(p, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // METHOD SORTING (Urutkan abjad A-Z)
    public void sortByName() {
        // Kalau kosong atau cuma ada 1 pesanan, nggak usah disortir
        if (isEmpty() || head.next == null) return; 
        
        boolean swapped;
        do {
            swapped = false;
            NodePesanan current = head;
            
            // Loop buat ngecek sebelahan
            while (current.next != null) { 
                // Jika nama pesanan sekarang LEBIH BESAR (secara abjad) dari pesanan sebelahnya
                if (current.pesanan.namaPesanan.compareToIgnoreCase(current.next.pesanan.namaPesanan) > 0) {
                    
                    // Kita TUKAR ISI DATANYA saja (objek pesanannya), gerbongnya tetap di tempat
                    Pesanan temp = current.pesanan;
                    current.pesanan = current.next.pesanan;
                    current.next.pesanan = temp;
                    
                    swapped = true; // Tandai kalau ada pertukaran
                }
                current = current.next; // Maju ngecek sebelahnya lagi
            }
        } while (swapped); // Ulangi terus sampai nggak ada yang perlu ditukar lagi
    }

    // METHOD CETAK LAPORAN
    public void printReport() {
        if (isEmpty()) {
            System.out.println("Belum ada pesanan yang masuk.");
            return;
        }
        
        // Panggil sorting dulu biar otomatis rapi sebelum dicetak
        sortByName(); 
        
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("===============================================");
        System.out.printf("%-15s %-20s %-15s\n", "Kode Pesanan", "Nama Pesanan", "Harga");
        
        NodePesanan current = head;
        int totalPendapatan = 0;
        
        while (current != null) {
            System.out.printf("%-15d %-20s %-15d\n", current.pesanan.kodePesanan, current.pesanan.namaPesanan, current.pesanan.harga);
            totalPendapatan += current.pesanan.harga; // Tambahkan harga ke total
            current = current.next;
        }
        System.out.println("===============================================");
        System.out.println("Total Pendapatan : Rp " + totalPendapatan);
    }
}