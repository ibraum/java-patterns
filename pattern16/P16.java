public class P16 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int sum = i;
            for (int j = 1; j <= n; j++) {
                System.out.print(sum + " ");
                sum += 1;
            }
            System.out.println();
        }
    }
}
