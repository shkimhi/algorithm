package two;

import java.util.Scanner;
public class No2525 {

    public static int oven() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int time = ((a*60)+b)+c;
        if(((a*60)+b)+c >= 1439){
            time = ((a*60)+b)+c - 1440 ;
        }

        System.out.printf("%d %d",time/60, time%60);

        return 0;
    }

}
