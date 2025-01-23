public class P10 {
    public static void main(String[] args) {
        // for (int i = 1; i <= 5 ; i++) {
        //     for (int j = 1; j <= 6; j++) {
        //         if (j < 6) {
        //             if (j == 1) {
        //                 System.out.print(1 + " ");
        //             } else if (j == 2 && i == 4) {
        //                 System.out.print(i - j + " ");
        //             } else if (j == 3) {
        //                 System.out.print(2 + " ");
        //             } else if (j == 5) {
        //                 System.out.print(3 + " ");
        //             } else {
        //                 System.out.print(i + " ");
        //             }
        //         } else {
        //             System.out.print(i + " ");
        //         }
        //     }
        //     System.out.println(" ");
        // }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(j + " " + i + " ");
            }
            System.out.println("\n");
        }
    }
}
