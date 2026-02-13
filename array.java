import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []namaMK = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking and Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja","Fisika"};
        int [] sks = {2,4,4,6,4,4,6,4,2};
        int jumlahMK = namaMK.length;
        int totalSKS = 0;
        double totalBobot = 0;
        double [] nilaiAngka = new double[jumlahMK];
        String [] nilaiHuruf = new String[jumlahMK];
        double [] nilaiSetara = new double[jumlahMK];
        for (int i = 0; i < jumlahMK; i++) {
            System.out.print("Masukkan Nilai Angka untuk MK " + namaMK[i] + ": ");
            nilaiAngka[i] = sc.nextDouble();
             if (nilaiAngka[i] > 80 && nilaiAngka[i] <= 100) {
            nilaiHuruf[i] = "A";
            nilaiSetara[i] = 4.0;
        } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
            nilaiHuruf[i] = "B+";
            nilaiSetara[i] = 3.5;
        } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
            nilaiHuruf[i] = "B";
            nilaiSetara[i] = 3.0;
        } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
            nilaiHuruf[i] = "C+";
            nilaiSetara[i] = 2.5;
        } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
            nilaiHuruf[i] = "C";
            nilaiSetara[i] = 2.0;
        } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
            nilaiHuruf[i] = "D";
            nilaiSetara[i] = 1.0;
        } else {
            nilaiHuruf[i] = "E";
            nilaiSetara[i] = 0.0;
        }
        totalSKS += sks[i];
        totalBobot += nilaiSetara[i] * sks[i];
        }
        double ipk = totalBobot / totalSKS;
                System.out.println("\n===== HASIL KONVERSI NILAI =====");
        System.out.printf("%-40s %-10s %-10s %-10s\n",
                "Mata Kuliah", "Nilai", "Huruf", "Bobot");

        for (int i = 0; i < jumlahMK; i++) {
            System.out.printf("%-40s %-10.2f %-10s %-10.2f\n",
                    namaMK[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }

        System.out.println("-----------------------------------------------");
        System.out.printf("IP Semester : %.2f\n", ipk);
    }
}
        
    