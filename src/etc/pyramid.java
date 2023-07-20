package etc;

import java.util.Scanner;

public class pyramid {
    public static int pyramid() {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        if (size % 2 == 0) {
            System.out.println("홀수아님.");
            return 0;
        }

        int mid = size / 2;
        char currentChar = 'A';

        for (int i = 0; i <= mid; i++) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print(currentChar);
                currentChar = (char) (currentChar + 1);
                if (currentChar > 'Z') {
                    currentChar = 'A';
                }
            }
            System.out.println();
        }

        for (int i = mid - 1; i >= 0; i--) {
            for (int j = 0; j < mid - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(currentChar);
                currentChar = (char) (currentChar + 1);
                if (currentChar > 'Z') {
                    currentChar = 'A';
                }
            }
            System.out.println();
        }
        return 0;
    }

}
