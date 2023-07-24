package four;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class No1546 {
    public static void array() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        double score = 0;
        int max =0;
        for(int i=0; i<arr.length; i++){
            if(i == 0){
                max = Integer.parseInt(arr[i]);
            }
            max = Integer.parseInt(arr[i]) > max ? Integer.parseInt(arr[i]):max;
        }

        for(int i=0; i<arr.length; i++){
            score += Double.valueOf(arr[i])/max*100;

        }




        bw.write(String.valueOf(score/a));

        bw.close();
    }

}
