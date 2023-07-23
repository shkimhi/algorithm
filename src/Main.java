import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        array();
    }
    public static void array() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] arr = new int[28];
        int[] arr2 = new int[30];

        for (int i =1; i <= 30; i++){
            arr2[i-1] = i;
        }

        for(int i =0; i < arr.length; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int j=0; j<arr.length; j++) {
            for (int i = 0; i < arr2.length; i++) {
                if (arr[j] == arr2[i]) {
                    arr2[i] = 0;
                }
            }
        }
        for(int i=0; i<arr2.length; i++){
            if(arr2[i] != 0) {
                bw.write(String.valueOf(arr2[i])+"\n");
            }
        }
        bw.close();
    }
}
