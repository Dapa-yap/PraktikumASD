public class perulangan {
    public static void main(String[] args) {
        String NIM = "254107020140";
        int n = 40;

        for (int i = 1; i < n; i++) {
            if (i == 10 || i == 15) {
                continue;
            }
            if (i % 3 == 0) {
                System.out.print("#");
            } else if (i % 2 != 0) {
                System.out.print("*");
            } else {
                System.out.print(i + "");     
            }
        }
        
    }
}
