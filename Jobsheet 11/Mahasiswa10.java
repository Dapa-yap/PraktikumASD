public class Mahasiswa10 {
   String nim;
   String nama;
   String kelas;
   double ipk;

   public Mahasiswa10(){

   }
   public Mahasiswa10(String nm, String name, String kls, double ip){
      nim = nm;
      nama = name;
      kelas = kls;
      ipk = ip;
   }
   void tampilInformasi(){
      System.out.println("NIM   : " + nim);
      System.out.println("Nama  : " + nama);
      System.out.println("Kelas : " + kelas);
      System.out.println("IPK   : " + ipk);
   }

}
