import java.util.Scanner;

public class No1330 {

    public static int iftest() {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else
            System.out.println("==");

        return 0;
    }

}
