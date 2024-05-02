package etc;

import java.io.IOException;
import java.util.Scanner;

public class TrafficCongestion3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[][] traffic = new int[N + 1][N + 1];

        for (int i = 0; i < M; i++) {
            int from = scanner.nextInt();
            int to = scanner.nextInt();
            int cars = scanner.nextInt();

            traffic[from][to] = Math.max(traffic[from][to], cars);
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(traffic[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }

}
