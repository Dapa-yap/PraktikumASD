public class quizdata10 {
    public static void main(String[] args) {
        quiz10 [] data = new quiz10[4];
        data[0] = new quiz10("Beras", 75000, 23, 0.05);
        data[1] = new quiz10("Gula", 17500, 58, 0.05);
        data[2] = new quiz10("Roti", 22000, 26, 0.02);
        data[3] = new quiz10("Susu", 12000, 64, 0.03);
        for (int i = 0; i < data.length; i++){
            data[i].tampilkandata();
            System.out.println("Harga setelah diskon " + data[i].tampilkandataSetelahDiskon());
            System.out.println("------------------------------------------");
    }
}
}
