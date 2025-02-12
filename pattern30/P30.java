public class P30 {
    public static void main(String[] args) {
        char[] alphabets = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        int n = 0;
        for (int i = 0; i < n + 5; i++) {
            for (int j = n; j < n + 5 && j < alphabets.length - 1; j++) {
                System.out.print(alphabets[j]);
            }
            n += 5;
            System.out.println();
        }
    }
}
