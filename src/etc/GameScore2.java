package etc;

import java.util.Scanner;

public class GameScore2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = scanner.nextInt();
        }
        int sum = 0;

        for (int i = N - 2; i >= 0; i--) {
            if (scores[i] >= scores[i + 1]) {
                int diff = scores[i] - scores[i + 1] + 1;
                scores[i] -= diff;
                sum += diff;
            }
        }
        System.out.println(sum);
    }

}
