import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        plus();
    }
    public static int plus(){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        System.out.println(a+b+c);


        return 0;
    }
}