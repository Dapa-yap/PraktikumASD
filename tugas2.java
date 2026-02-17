import java.util.Scanner;
public class tugas2 {
    static void inputJadwal(String[][] Jadwal){
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < Jadwal.length; i++) {
            System.out.println("Data jadwal ke-" + (i+1));
            System.out.println("Nama Mata Kuliah: ");
            Jadwal [i][0] = sc.nextLine();
            System.out.println("Ruang: ");
            Jadwal [i][1] = sc.nextLine();
            System.out.println("Hari: ");
            Jadwal [i][2] = sc.nextLine();
            System.out.println("Jam: ");
            Jadwal [i][3] = sc.nextLine();

        }
    }
    static void tampilJadwal(String[][] Jadwal){
      System.out.println("\n=== DAFTAR JADWAL KULIAH ===");
        System.out.printf("%-25s %-15s %-10s %-15s\n", 
                          "Nama MK", "Ruang", "Hari", "Jam");
        System.out.println("--------------------------------");
        for (int i = 0; i < Jadwal.length; i++) {
            System.out.printf("%-25s %-15s %-10s %-15s\n", 
                              Jadwal[i][0], Jadwal[i][1], Jadwal[i][2], Jadwal[i][3]);
        }
    }
    static void cariHari(String[][] Jadwal){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan hari yang dicari: ");
        String hari = sc.nextLine();
        boolean ditemukan =false;
        for (int i = 0; i < Jadwal.length; i++) {
            if (Jadwal[i][2].equalsIgnoreCase(hari)) {
                if (!ditemukan) {
                    System.out.println("Jadwal pada hari " + hari + ":");
                    ditemukan = true;
                }
                System.out.println(Jadwal[i][0] + " - " + Jadwal[i][1] + " - " + Jadwal[i][3]);
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada jadwal pada hari " + hari);
        }
    }
    static void cariNama(String[][] Jadwal){
     Scanner sc = new Scanner(System.in); 
     System.out.println("Masukkan Nama Mata Kuliah yang dicari: ");
     String namaMK = sc.nextLine();
     boolean ditemukan = false;
     for (int i = 0; i < Jadwal.length; i++) {
        if (Jadwal [i][0].equalsIgnoreCase(namaMK)) {
            System.out.println("Jadwal Ditemukan");
            System.out.println("Ruang : " + Jadwal[i][1]);
            System.out.println("Hari  : " + Jadwal[i][2]);
            System.out.println("Jam   : " + Jadwal[i][3]);
            ditemukan = true;
        }
     }  
     if (!ditemukan) {
        System.out.println("Jadwal tidak ditemukan");
     }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah jadwal mata kuliah ");
        int n = sc.nextInt();
        sc.nextLine();
        String [][] Jadwal= new String[n][4];
        inputJadwal(Jadwal);
        int pilih;
        do{
            System.out.println("\n=== MENU ===");
            System.out.println("1. Tampilkan Semua Jadwal");
            System.out.println("2. Cari Jadwal Berdasarkan Hari");
            System.out.println("3. Cari Jadwal Berdasarkan Nama Mata Kuliah");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih){
                case 1:
                tampilJadwal(Jadwal);
                break;
                case 2:
                cariHari(Jadwal);
                break;
                case 3:
                cariNama(Jadwal);
                break;
                case 4:
                System.out.println("Program selesai");
                break;
                default:
                System.out.println("Menu tidak valid");    

            }
        } while (pilih != 4);
    }
}


