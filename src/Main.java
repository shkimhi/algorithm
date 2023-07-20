import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        costco();
    }
    public static int costco() {
        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int TotalObjects = sc.nextInt();
        int sum[] = new int[TotalObjects];
        int TotalSum = 0;

        for (int i =0; i < TotalObjects; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            sum[i] = x * y;
        }
        for (int i =0; i < sum.length; i++){
           TotalSum += sum[i];
        }

        if(total == TotalSum){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }


        return 0;
    }
}
