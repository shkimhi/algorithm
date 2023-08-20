package etc;

import java.io.IOException;
import java.util.Scanner;

public class No4999 {
    public static void processInput() throws IOException {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        if (a.length() >= b.length()) {
            System.out.println("go");
        }else {
            System.out.println("no");
        }
    }

}
