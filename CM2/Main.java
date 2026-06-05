import java.util.Scanner;
    public class Main{
    public static void main(String[] args) {
        SLLAntrian antrian = new SLLAntrian(); 
        SLLPesanan pesanan = new SLLPesanan(); 
        Scanner sc = new Scanner(System.in);

        // Pre-populasi data via konstruktor
        antrian.enqueue(new Pembeli("Ainra", "08224500000"));
        antrian.enqueue(new Pembeli("Danra", "08224511111"));
        antrian.enqueue(new Pembeli("Sanri", "08224522222"));
        antrian.enqueue(new Pembeli("Vania", "08422234556"));

        int menu = -1;
        do {
            System.out.println("\nSISTEM ANTRIAN ROYAL DELISH");
            System.out.println("===============================================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian dan Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            
            if(sc.hasNextInt()) {
                menu = sc.nextInt();
                sc.nextLine(); // Membersihkan sisa enter agar input String selanjutnya tidak terlewat
            } else {
                System.out.println("Input tidak valid!");
                sc.nextLine(); 
                continue;
            }

            switch (menu) {
                case 1:
                    System.out.println("===============================================");
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String hp = sc.nextLine();
                    
                    antrian.enqueue(new Pembeli(nama, hp));
                    System.out.println("Antrian berhasil ditambahkan dengan nomor: " + (antrian.counter - 1));
                    break;
                    
                case 2:
                    System.out.println("===============================================");
                    antrian.print();
                    break;
                    
                case 3:
                    System.out.println("===============================================");
                    
                    NodeAntrian panggil = antrian.dequeue();
                    
                    // Mengecek apakah ada antrean yang berhasil dipanggil
                    if (panggil != null) {
                        System.out.println(panggil.pembeli.namaPembeli + " sedang memesan...");
                        
                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine(); // Membersihkan sisa enter
                        
                        System.out.print("Nama Pesanan : ");
                        String namaPesanan = sc.nextLine();
                        
                        System.out.print("Harga        : ");
                        int harga = sc.nextInt();
                        sc.nextLine(); // Membersihkan sisa enter
                        
                        pesanan.addPesanan(new Pesanan(kode, namaPesanan, harga));
                        System.out.println(panggil.pembeli.namaPembeli + " telah memesan " + namaPesanan);
                    }
                    break;
                    
                case 4:
                    System.out.println("===============================================");
                    pesanan.printReport();
                    break;
                    
                case 0:
                    System.out.println("Keluar dari sistem...");
                    break;
                    
                default:
                    System.out.println("Menu tidak tersedia!");
            }
        } while (menu != 0); 
        
        sc.close();
    }
}

