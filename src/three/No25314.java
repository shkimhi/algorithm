package three;

import java.util.Scanner;

public class No25314 {
        public static int longint() {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt();
            int division = n/4;

            for (int i=0; i<division; i++ ){
                System.out.print("long ");
            }
            System.out.println("int");

            return 0;
        }
    }

