public class P13 {
    public static void main(String[] args) {
        int x = 9;
        int z = 1;
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int y = 0;
            for (int j = 1; j <= n; j++) {
                if (j % 2 == 0) {
                    y += x;
                    System.out.print(y + " ");
                } else if (j == 1) {
                    y = i;
                    System.out.print(y + " ");
                } else {
                    y += z;
                    System.out.print(y + " ");
                }
            }
            x -= 2;
            z += 2;
            System.out.println("");
        }
    }
}
