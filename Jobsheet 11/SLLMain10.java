import java.util.Scanner;
public class SLLMain10 { 
    public static void main(String[] args) {
        SingleLinkedList10 sll = new SingleLinkedList10(); 
        Scanner sc = new Scanner(System.in);
        int pilihan = 0;
        do {
            System.out.println("=================================");
            System.out.println("  MENU SINGLE LINKED LIST MHS    ");
            System.out.println("=================================");
            System.out.println("1. Tambah Data di Awal (addFirst)");
            System.out.println("2. Tambah Data di Akhir (addLast)");
            System.out.println("3. Cetak Data (print)");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            pilihan = sc.nextInt();
            sc.nextLine(); 
            System.out.println("---------------------------------");
            if (pilihan == 1 || pilihan == 2) {
                System.out.print("Masukkan NIM: ");
                String nim = sc.nextLine(); 
                System.out.print("Masukkan Nama: ");
                String nama = sc.nextLine();
                System.out.print("Masukkan Kelas: ");
                String kelas = sc.nextLine();
                System.out.print("Masukkan IPK: ");
                double ipk = sc.nextDouble();
                sc.nextLine(); 
                Mahasiswa10 mhsBaru = new Mahasiswa10(nim, nama, kelas, ipk);
                if (pilihan == 1) {
                    sll.addFirst(mhsBaru);
                    System.out.println("-> Data berhasil ditambahkan di AWAL!\n");
                } else {
                    sll.addLast(mhsBaru);
                    System.out.println("-> Data berhasil ditambahkan di AKHIR!\n");
                }
            } else if (pilihan == 3) {
                sll.print();
            } else if (pilihan == 4) {
                System.out.println("Terima kasih! Program selesai.");
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.\n");
            }
        } while (pilihan != 4);
    }
}