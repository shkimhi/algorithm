package four;

import java.io.*;
import java.util.StringTokenizer;

public class No10818 {

    public static int array2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);

        for(int i=1; i<a; i++){
            int num = Integer.parseInt(arr[i]);
            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }

        }
        bw.write(String.valueOf(min)+" "+String.valueOf(max));

        bw.close();

        return 0;
    }

}

/*
     public static int array2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");

        int max = 0;
        int min = 0;

        for(int i=0; i<a; i++){
            if(max < Integer.parseInt(arr[i])){
                max = Integer.parseInt(arr[i]);
            }
            if(i == 0) {
                min =  Integer.parseInt(arr[i]);
            }
            min = Integer.parseInt(arr[i]) > min ? min : Integer.parseInt(arr[i]);
        }
        bw.write(String.valueOf(min)+" "+String.valueOf(max));

        bw.close();

        return 0;
    }
*/