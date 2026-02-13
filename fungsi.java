public class fungsi {
    public static void stockRoyalGarden(){
        int [][]stock = {
            {10,5,15,7},
            {6,11,9,12},
            {2,10,10,5},
            {5,7,12,9}
        };
        String [] cabang = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};
        int []harga = {75000,50000,60000,10000};
        for (int i = 0; i < stock.length; i++) {
            int pendapatan = hitungPendapatan(stock[i], harga);
            tampilkanHasil(cabang[i], pendapatan);
        }
    }
    public static int hitungPendapatan(int[] stockCabang,int []harga){
        int total = 0;
        for (int i = 0; i < stockCabang.length; i++) {
            total += stockCabang[i] * harga[i];
        }
        return total;
    }
    public static void tampilkanHasil(String cabang, int pendapatan){
        System.out.println(cabang);
        System.out.println("Pendapatan: Rp " + pendapatan);
        if (pendapatan > 1500000) {
            System.out.println("Status : Sangat Baik");
        }else{
            System.out.println("Status : perlu evaluasi");
        }
    }
    public static void main(String[] args) {
        stockRoyalGarden();
    }
}




