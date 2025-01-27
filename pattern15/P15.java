public class P15 {
    public static void main(String[] args) {
        int n =5;
        int even = 1;
        int odd = 9;
        for (int i = n; i >= 1; i--) {
            int y = i;
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 0) {
                    y += even;
                    System.out.print(y + " ");
                } else if (j == 1) {
                    System.out.print(y + " ");
                } else {
                    y += odd;
                    System.out.print(y + " ");
                }
            }
            System.out.println();
            even += 2;
            odd -= 2;
        }
    }
}
