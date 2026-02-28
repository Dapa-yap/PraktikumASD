public class DataDosen {
    void dataSemuaDosen(Dosen[] arrayOfDosen){
        for (Dosen dosen : arrayOfDosen) {
            System.out.println("Data Dosen ke-" + (arrayOfDosen.length + 1));
            System.out.println("Kode    :" + dosen.kode);
            System.out.println("Nama    :" + dosen.nama);
            System.out.println("Jenis Kelamin :" + (dosen.jenisKelamin ? "Laki" : "Perempuan"));
            System.out.println("Usia    :" + dosen.usia);
            System.out.println("------------------------");
        }
    }
    void jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen){
     int jumlahLaki = 0;
     int jumlahPerempuan = 0;
     for (Dosen dosen : arrayOfDosen) {
        if (dosen.jenisKelamin) {
            jumlahLaki++;
        } else {
            jumlahPerempuan++;
        }
     }   
     System.out.println("Jumlah dosen laki-laki: " + jumlahLaki);
     System.out.println("Jumlah dosen perempuan: " + jumlahPerempuan);
    }
    void rataRataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen){
        int jumlahLaki=0;
        int jumlahPerempuan=0;
        int totalUsiaLaki=0;
        int totalUsiaPerempuan=0;
        for (Dosen dosen : arrayOfDosen) {
            if (dosen.jenisKelamin) {
                jumlahLaki++;
                totalUsiaLaki += dosen.usia;
            } else {
                jumlahPerempuan++;
                totalUsiaPerempuan += dosen.usia;
            }
        }
        double rataRataLaki = (double) totalUsiaLaki / jumlahLaki;
        double rataRataPerempuan = (double) totalUsiaPerempuan / jumlahPerempuan;
        System.out.println("Rata-rata usia dosen laki-laki: " + rataRataLaki);
        System.out.println("Rata-rata usia dosen perempuan: " + rataRataPerempuan);
    }
    void DosenTerTua(Dosen[] arrayOfDosen){
    Dosen dosenTertua = arrayOfDosen[0];
    for (Dosen d : arrayOfDosen) {
    if (d.usia > dosenTertua.usia) {
        dosenTertua = d;
    }
    }
    System.out.println("\n=== Dosen Paling Tua ===");
    System.out.println("Kode    : " + dosenTertua.kode);
    System.out.println("Nama    : " + dosenTertua.nama);
    System.out.println("Jenis Kelamin : " + 
    (dosenTertua.jenisKelamin ? "Laki" : "Perempuan"));
    System.out.println("Usia    : " + dosenTertua.usia);
    }
    void DosenTerMuda(Dosen[] arrayOfDosen){
     Dosen dosenTermuda = arrayOfDosen[0];
     for (Dosen d : arrayOfDosen) {
        if (d.usia < dosenTermuda.usia) {
            dosenTermuda = d;
        }
     }
    System.out.println("\n=== Dosen Paling Muda ===");
    System.out.println("Kode    : " + dosenTermuda.kode);
    System.out.println("Nama    : " + dosenTermuda.nama);
    System.out.println("Jenis Kelamin : " + 
    (dosenTermuda.jenisKelamin ? "Laki" : "Perempuan"));
    System.out.println("Usia    : " + dosenTermuda.usia);
    }
}
