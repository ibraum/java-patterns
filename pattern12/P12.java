public class P12 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            int x = 5;
            int n = i;
            for (int j = 1; j <= 5 ; j++) {
                System.out.print(n + " ");
                n += x;
            }
            System.out.println("\n");
        }
    }
}
