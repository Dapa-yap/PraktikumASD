public class Matakuliah {
    String nama;
    String kodeMK;
    int sks;
    int jumlahJam;

    public Matakuliah(){

    }
    public Matakuliah(String nama, String kodeMK, int sks, int jumlahJam){
        this.nama = nama;
        this.kodeMK = kodeMK;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    void tampilInformasi(){
        System.out.println("Nama mk : " + nama);
        System.out.println("kode mk : " + kodeMK);
        System.out.println("SKS : " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    void ubahSKS(int sksBaru){
        sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi : " + sks);
    }
    void tambahJam(int jam){
        jumlahJam += jam;
        System.out.println("Jumlah jam sekarang " + jumlahJam);
    }
    void kurangiJam(int jam){
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah jam sekarang " + jumlahJam);
        }else {
            System.out.println("Jumlah jam tidak mencukupi");
        }
    }

}
