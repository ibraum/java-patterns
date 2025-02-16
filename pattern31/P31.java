public class P31 {
    public static void main(String[] args) {
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        
        for (int i = 0; i < alphabet.length; i++) {
            for (int j = i; j < i + 6 && j == alphabet.length - 1; j++) {
                System.out.print(alphabet[j]);
            }
            System.out.println();
        }
    }
}
