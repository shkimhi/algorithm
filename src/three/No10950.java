package three;

import java.util.Scanner;

public class No10950 {
    public static int sum() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int c[] = new int[a];

        for(int i = 0; i<a; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            c[i] = x+y;
        }

        for(int i =0; i<a; i++){
            System.out.println(c[i]);
        }


        return 0;
    }

}
