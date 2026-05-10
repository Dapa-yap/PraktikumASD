import java.util.Scanner;

public class SuratDemo10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        stackSurat stack = new stackSurat(10); 
        int pilih;

        do {
            System.out.println("\n=== MENU PENGELOLAAN SURAT IZIN ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Izin Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilih = scan.nextInt();
            scan.nextLine(); // membersihkan buffer enter

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat       : ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas          : ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.nextLine().charAt(0);
                    System.out.print("Durasi (hari)  : ");
                    int durasi = scan.nextInt();
                    scan.nextLine();
                    
                    surat10 srtBaru = new surat10(id, nama, kelas, jenis, durasi);
                    stack.push(srtBaru);
                    break;

                case 2:
                    surat10 diproses = stack.pop();
                    if (diproses != null) {
                        System.out.println("Memproses surat dari: " + diproses.namaMahasiswa);
                        System.out.println("ID Surat: " + diproses.idSurat);
                        System.out.println("Status: Telah diproses dan divalidasi oleh admin Prodi.");
                    }
                    break;

                case 3:
                    surat10 atas = stack.peek();
                    if (atas != null) {
                        System.out.println("Surat Izin Terakhir (Paling Atas):");
                        System.out.println("ID Surat   : " + atas.idSurat);
                        System.out.println("Nama       : " + atas.namaMahasiswa);
                        System.out.println("Kelas      : " + atas.kelas);
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = scan.nextLine();
                    stack.cariSurat(cariNama);
                    break;

                case 5:
                    System.out.println("Keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1-5.");
            }
        } while (pilih != 5);
        
        scan.close();
    }
}