public class P29 {
    public static void main(String[] args) {
        char[] alphabets = {'A', 'B', 'C', 'D', 'E'};
        int n = 5;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(alphabets[j]);
            }
            System.out.println();
        }
    }
}
