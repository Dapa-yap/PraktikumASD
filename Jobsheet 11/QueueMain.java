import java.util.Scanner;

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("==================================");
        System.out.print("kapasitas maksimal antrian hari ini: ");
        int kapasitas = sc.nextInt();
        sc.nextLine(); 
        
        QueueLinkedList q = new QueueLinkedList(kapasitas);
        int pilih = 0;

        do {
            System.out.println("\n==================================");
            System.out.println("  LAYANAN UNIT MAHASISWA");
            System.out.println("==================================");
            System.out.println("1. Ambil Nomor Antrian (Daftar)");
            System.out.println("2. Panggil Antrian (Dequeue)");
            System.out.println("3. Cek Antrian Terdepan & Terakhir");
            System.out.println("4. Lihat Daftar Antrian & Jumlah");
            System.out.println("5. Cek Status Antrian (Kosong/Penuh)");
            System.out.println("6. Kosongkan Semua Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-6): ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            System.out.println("----------------------------------");

            switch (pilih) {
                case 1:
                    if (!q.IsFull()) {
                        System.out.print("Masukkan NIM       : ");
                        String nim = sc.nextLine();
                        System.out.print("Masukkan Nama      : ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan Keperluan : ");
                        String keperluan = sc.nextLine();
                        
                        Mahasiswa mhsBaru = new Mahasiswa(nim, nama, keperluan);
                        q.enqueue(mhsBaru);
                    } else {
                        System.out.println("Gagal menambahkan! Antrian sudah penuh.");
                    }
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peekFrontAndRear();
                    break;
                case 4:
                    q.print();
                    break;
                case 5:
                    System.out.println("Apakah antrian kosong? " + q.IsEmpty());
                    System.out.println("Apakah antrian penuh?  " + q.IsFull());
                    break;
                case 6:
                    q.clear();
                    break;
                case 0:
                    System.out.println("Program layanan ditutup. Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
                    break;
            }
        } while (pilih != 0);
    }
}