public class mahasiswaMain {
    public static void main(String[] args) {
        mahasiswa mhs1 = new mahasiswa("Muhammad Ali Farhan", "2241720171", 3.55, "SI 2J");
        
        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();
        mahasiswa mhs2 = new mahasiswa("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}
