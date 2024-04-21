package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1225_v {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] numbers = input.split(" ");
        String A = numbers[0];
        String B = numbers[1];

        if (A.equals("0") || B.equals("0")) {
            System.out.println("0");
            return;
        }

        long sum = 0;

        for (int i = 0; i < A.length(); i++) {
            int digitA = A.charAt(i) - '0';
            for (int j = 0; j < B.length(); j++) {
                int digitB = B.charAt(j) - '0';
                sum += digitA * digitB;
            }
        }

        System.out.println(sum);
    }

}
