public class DosenMain {
    public static void main(String[] args) {
        Dosen d1 = new Dosen();
        d1.idDosen = "D001";
        d1.nama = "Bpk. Imam";
        d1.statusAktif = true;
        d1.tahunBergabung = 2020;
        d1.bidangKeahlian = "Pemrograman";
        d1.tampilInformasi();
        d1.setStatusaktif();
        d1.ubahKeahlian("Data Science");
        System.out.println("Masa kerja: " + d1.hitungMasaKerja(2025) + " tahun");

        Dosen d2 = new Dosen("D002", "Ibu Mungki", true, 2019, "Matematika");
        d2.tampilInformasi();
        d2.ubahKeahlian("Fisika");
        System.out.println("Masa kerja: " + d2.hitungMasaKerja(2025) + " tahun");

    }
}
