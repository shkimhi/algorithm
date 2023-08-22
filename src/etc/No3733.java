package etc;

import java.io.IOException;
import java.util.Scanner;

public class No3733 {
    public static void processInput() throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, s;
        while (sc.hasNext()) {
            n = sc.nextInt();
            s = sc.nextInt();
            System.out.println(s / (n + 1));
        }
    }

}
