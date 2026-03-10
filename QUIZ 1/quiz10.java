public class quiz10{
    public String nama;
    public double harga;
    public int stok;
    public double diskon;

    public quiz10(){

    }
    public quiz10(String nama, double harga, int stok, double diskon){
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.diskon = diskon;
    }
    void tampilkandata(){
        System.out.println("Nama Barang     :" + nama);
        System.out.println("Harga Barang    :" + harga);
        System.out.println("Stock Barang    :" + stok);
        System.out.println("Diskon Barang   :" + diskon);
    }
    double tampilkandataSetelahDiskon(){
        double hargaDiskon = harga - ((harga * diskon)/100);
        return hargaDiskon;
        
        
    }

}