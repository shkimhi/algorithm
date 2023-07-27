package six;

import java.io.IOException;
import java.util.Scanner;

public class No2444 {
    public static void String() throws IOException {
        Scanner sc= new Scanner(System.in);

        int a = sc.nextInt();
        int n = 2*a-1;

        for(int i = 0; i<a; i++) {
            for (int j = 1; j < a-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i*2+1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for(int i=a-1; i>0; i--) {
            for(int j=a-i; j>0; j--){
                System.out.print(" ");
            }
            for(int k=i*2-1; k>0; k--){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}
