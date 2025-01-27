public class P14 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i > 1; i--) {
            int sum = i;
            for (int j = 1; j <= n; j++) {
                System.out.print(sum + " ");
                sum += n;
            }
            System.out.println();
        }
    }
}
