package two;

import java.util.Scanner;

public class No2480 {
    public static int dice() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int sum = 0;
        int sum2 = 0;

        if(a == b){
            if(a == c){
                System.out.println(10000 + a * 1000);
            }else if(a != c){
                System.out.println(1000 + a * 100);
            }
        }else if(a != b){
            if(a == c){
                System.out.println(1000 + c * 100);
            } else if (b == c) {
                System.out.println(1000 + c * 100);
            } else{
                sum = a > b ? a:b;
                sum2 = c > sum ? c:sum;
                System.out.println(sum2 * 100);
            }
        }

        return 0;
    }
}
