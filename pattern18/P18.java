public class P18 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int sum = i;
            for (int j = 1; j <= n; j++) {
                // if (sum % 2 == 0) {
                //     System.out.print(1 + " ");
                // } else {
                //     System.out.print(0 + " ");
                // }
                System.out.print(((i + j) % 2) + " ");
                // sum += 1;
            }
            System.out.println();
        }
    }
}