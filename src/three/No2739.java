package three;

import java.util.Scanner;
public class No2739 {
    public static int gugudan() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 1; i<=9; i++){
            System.out.println(a+" * "+i+" = "+a*i);
        }


        return 0;
    }

}
