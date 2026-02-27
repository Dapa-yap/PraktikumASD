import java.util.Scanner;
public class mataKuliahDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        mataKuliah [] arrayOfMatakuliah = new mataKuliah[3];


        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Masukkan data mata kuliah ke-" + (i+1));
            arrayOfMatakuliah[i] = new mataKuliah();
            arrayOfMatakuliah[i].tambahData(sc);
        }
        for (int i = 0; i < arrayOfMatakuliah.length; i++) {
            System.out.println("Data Mata Kuliah Ke-" + (i+1));
            arrayOfMatakuliah[i].cetakInfo();
            System.out.println("---------------------------------");
        }
    }
}


