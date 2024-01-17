import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String arr [] = new String[5];
        int H = 0;
        int M = 0;
        int answer =0;
        for(int i=0; i<5; i++){
            arr[i] = br.readLine();
        }

        for(int i =0; i<5; i++){
            String start_h = arr[i].substring(0,2);
            String start_m = arr[i].substring(3,5);

            String end_h = arr[i].substring(6,8);
            String end_m = arr[i].substring(9,11);
            H += Integer.parseInt(end_h) - Integer.parseInt(start_h);
            M += Integer.parseInt(start_m) - Integer.parseInt(end_m);
        }
        answer = (H*60) + M;
        bw.write(String.valueOf(answer));
        bw.close();
        br.close();
    }
}
