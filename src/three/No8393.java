package three;

import java.util.Scanner;

public class No8393 {
    public static int sum() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= a; i++){
            sum += i;
        }
        System.out.println(sum);
        return 0;
    }

}
