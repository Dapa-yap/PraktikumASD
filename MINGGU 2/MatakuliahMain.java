public class MatakuliahMain {

    public static void main(String[] args) {
        Matakuliah mk1 = new Matakuliah();
        mk1.nama = "Pemrograman";
        mk1.kodeMK = "MK001";
        mk1.sks = 3;
        mk1.jumlahJam = 6;
        mk1.tampilInformasi();
        mk1.ubahSKS(2);
        mk1.tambahJam(1);
        mk1.kurangiJam(2);

        Matakuliah mk2 = new Matakuliah("Algoritma", "MK002", 2, 6);
        mk2.tampilInformasi();
        mk2.ubahSKS(3);
        mk2.tambahJam(2);
        mk2.kurangiJam(1);
    }
}