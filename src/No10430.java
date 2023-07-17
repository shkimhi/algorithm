import java.util.Scanner;

public class No10430 {
    public static void no10430(){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int answer1 = 0;
    int answer2 = 0;
    int answer3 = 0;
    int answer4 = 0;

    answer1 = (A+B)%C ;
    answer2 = ((A%C) + (B%C))%C;
    answer3 = (A*B)%C;
    answer4 = ((A%C)*(B%C))%C;

    System.out.println(answer1);
    System.out.println(answer2);
    System.out.println(answer3);
    System.out.println(answer4);
    }
}
