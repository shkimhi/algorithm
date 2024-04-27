import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int i , sum = 0;

        for(i=2; i<=100; i++){
            if(test(i)){
                sum+=i;
            }
        }

        System.out.println(sum);

    }

    static boolean test(int n){
        int i , sum = 0;
        for(i = 1; i <= n/2; i++){
            if(n%i == 0){
                sum += i;
            }
        }
        if(n == sum){
            return true;
        }
        return false;
    }
    }

