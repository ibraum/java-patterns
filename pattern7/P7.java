public class P7 {
    public static void main(String[] args) {
        for (int i = 0; i <= 40; i+=10) {
            for (int j = 0; j < 10; j++) {
                if (j % 2 != 0) {
                    System.out.print(j + i + " ");
                }
            }
            System.out.println('\n');
        }
    }
}
