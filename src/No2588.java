import java.util.Scanner;

public class No2588 {
    public static int multiplication(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String[] strArr = sc.next().split("");
        int f = Integer.parseInt(String.join("",strArr));
        int answer1 = 0;
        int answer2 = 0;
        int answer3 = 0;
        int answer4 = 0;
        int b,c,d,e = 0;
        b = Integer.parseInt(strArr[0]);
        c = Integer.parseInt(strArr[1]);
        d = Integer.parseInt(strArr[2]);
        answer1 = a * b;
        answer2 = a * c;
        answer3 = a * d;
        answer4 = a * f;

        System.out.println(answer3);
        System.out.println(answer2);
        System.out.println(answer1);
        System.out.println(answer4);

        return 0;
    }

}
