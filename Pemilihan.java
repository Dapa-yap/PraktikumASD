import java.util.Scanner;
public class Pemilihan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Program Menghitung nilai akhir");
        System.out.println("========================");
        System.out.print("Masukkan nilai tugas: ");
        double tugas = sc.nextInt();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = sc.nextInt();
        System.out.print("Masukkan nilai uts: ");
        double uts = sc.nextInt();
        System.out.print("Masukkan nilai uas: ");
        double uas = sc.nextInt();
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("Nilai tidak valid");
        } else {
        }
        double total = (tugas * 0.2) + (kuis * 0.2) + (uts * 0.3) + (uas * 0.3);
        System.out.println("========================");
        System.out.println("========================");
        System.out.println("Nilai total: " + total);
            String nilaiHuruf;
        String keterangan;
        if (total > 80 && total <= 100) {
            nilaiHuruf = "A";
            keterangan = "Sangat Baik";
        } else if (total > 73 && total <= 80) {
            nilaiHuruf = "B+";
            keterangan = "Lebih dari Baik";
        } else if (total > 65 && total <= 73) {
            nilaiHuruf = "B";
            keterangan = "Baik";
        } else if (total > 65 && total <= 60) {
            nilaiHuruf = "C+";
            keterangan = "Lebih dariCukup";
        } else if (total > 50 && total <= 60) {
            nilaiHuruf = "C";
            keterangan = "Cukup";
        } else if (total > 39 && total <= 50) {
            nilaiHuruf = "D";
            keterangan = "Kurang";
        } else {
            nilaiHuruf = "E";
            keterangan = "Gagal";
        }
        System.out.println("Nilai huruf: " + nilaiHuruf);
        System.out.println("========================");
        System.out.println("========================");
        System.out.println("Keterangan: " + keterangan);
    }
}