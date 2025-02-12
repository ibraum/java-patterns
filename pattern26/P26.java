public class P26 {
    public static void main(String[] args) {
        char[] alphabets = {'A', 'B', 'C', 'D', 'E'};
        int n = 5;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(alphabets[i]);
            }
            System.out.println();
        }
    }
}
