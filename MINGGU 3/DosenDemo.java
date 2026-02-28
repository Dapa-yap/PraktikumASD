import java.util.Scanner;
public class DosenDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = Integer.parseInt(sc.nextLine());
        Dosen[] arrayOfDosen = new Dosen[jumlah];

        for (int i = 0; i < arrayOfDosen.length; i++) {
            arrayOfDosen[i] = new Dosen();
            System.out.println("Masukkan data dosen ke-" + (i+1));
            System.out.println("Kode    :");
            arrayOfDosen[i].kode = sc.nextLine();
            System.out.println("Nama    :");
            arrayOfDosen[i].nama = sc.nextLine();
            System.out.print("Jenis Kelamin (laki/perempuan): ");
            String inputJK = sc.nextLine();
            while (!inputJK.equalsIgnoreCase("laki") && !inputJK.equalsIgnoreCase("perempuan")) {
            System.out.println("Input salah! Hanya boleh 'laki' atau 'perempuan'");
            System.out.print("Jenis Kelamin: ");
            inputJK = sc.nextLine();
            }
            arrayOfDosen[i].jenisKelamin = inputJK.equalsIgnoreCase("laki");
            System.out.println("Usia    :");
            arrayOfDosen[i].usia = Integer.parseInt(sc.nextLine());
        }
        System.out.println("\n=== Data Dosen ===");
        for (Dosen d : arrayOfDosen) {
            System.out.println("Kode    : " + d.kode);
            System.out.println("Nama    : " + d.nama);
            System.out.println("Jenis Kelamin : " + 
            (d.jenisKelamin ? "Laki" : "Perempuan"));
            System.out.println("Usia    : " + d.usia);
            System.out.println("------------------------");
        }
        
        
    }
}


