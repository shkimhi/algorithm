import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        String();
    }
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("");
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += Integer.parseInt(arr[i]);
        }
        bw.write(String.valueOf(sum));

        bw.close();
    }
}
