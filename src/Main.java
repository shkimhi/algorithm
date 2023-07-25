import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String();
    }
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int[] arr2 = {1,1,2,2,2,8};
        int[] cnt = new int[6];

        for(int i=0; i<arr.length; i++){
            int a = Integer.parseInt(arr[i]);
            cnt[i] = arr2[i] - a;
        }

        for(int i=0; i<arr.length; i++){
            bw.write(String.valueOf(cnt[i])+" ");
        }
        bw.close();
    }
}

