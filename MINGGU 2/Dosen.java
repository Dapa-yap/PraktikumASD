public class Dosen {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

    public Dosen(){

    }
    public Dosen(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian){
        this.idDosen = idDosen;
        this.nama = nama;
        this.statusAktif = statusAktif;
        this.tahunBergabung = tahunBergabung;
        this.bidangKeahlian = bidangKeahlian;
    }
    void tampilInformasi(){
        System.out.println("ID Dosen : " + idDosen);
        System.out.println("Nama : " + nama);
        System.out.println("Status Aktif : " + statusAktif);
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
    }
    void setStatusaktif(){
        statusAktif = false;
        if (statusAktif == true) {
            System.out.println("Dosen aktif");
        } else {
            System.out.println("Dosen tidak aktif");
        }
    }
    int hitungMasaKerja(int tahunsekarang){
        return tahunsekarang - tahunBergabung;
    }
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian diubah menjadi: " + bidangKeahlian);
    }
}
