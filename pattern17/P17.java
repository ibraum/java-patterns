public class P17 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i < n; i+=2) {
            int sum = i;
            for (int j = 1; j <= n/2; j++) {
                System.out.print(sum + " ");
                sum += 2;
            }         
            System.out.println();  

        }
    }
}
