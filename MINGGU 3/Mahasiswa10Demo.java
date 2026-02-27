import java.util.Scanner;
public class Mahasiswa10Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa10 [] arrayOfMahasiswa = new Mahasiswa10[3];
        String dummy;
        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa10();
            System.out.println("Masukkan data mahasiswa ke-" + (i+1));
            System.out.print("NIM     :");
            arrayOfMahasiswa[i].nim =sc.nextLine();
            System.out.print("Nama    :");
            arrayOfMahasiswa[i].nama =sc.nextLine();   
            System.out.print("Kelas   :");
            arrayOfMahasiswa[i].kelas =sc.nextLine();
            System.out.print("IPK     :");
            dummy = sc.nextLine();
            arrayOfMahasiswa[i].ipk =Float.parseFloat(dummy);
            System.out.println("---------------------------------");
        }
        for (int i = 0; i < arrayOfMahasiswa.length; i++) {
            System.out.println("Data Mahasiswa Ke-" + (1+i));
            arrayOfMahasiswa[i].cetakInfo();
            System.out.println("---------------------------------");
        }

    }
    
}
