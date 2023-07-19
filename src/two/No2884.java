package two;

import java.util.Scanner;

public class No2884 {

    public static int time() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 0 && b < 45){
            a = 24;
        }
        int c = ((a*60)+b) - 45 ;

        System.out.printf("%d %d", c/60 , c%60);


        return 0;
    }

}
