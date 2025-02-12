public class P28 {
    public static void main(String[] args) {
        char[] alphabets = {'A', 'B', 'C', 'D', 'E'};
        int n = 5;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                System.out.print(alphabets[i]);
            }
            System.out.println();
        }
    }
}
