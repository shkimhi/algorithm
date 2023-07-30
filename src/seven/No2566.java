package seven;

import java.io.*;
import java.util.StringTokenizer;

public class No2566 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[][] arr = new int[10][10];
        int max = 0;
        String check = "0 0";
        for (int i =0; i<9; i++){
            st = new StringTokenizer(br.readLine());

            for(int j =0; j<9; j++){
                int a =Integer.parseInt(st.nextToken());
                if(a >= max){
                    max = a;
                    check = String.valueOf(i+1)+" "+String.valueOf(j+1);
                }
                arr[i][j] = a;
            }
        }

        bw.write(String.valueOf(max)+"\n"+ check);



        bw.close();
    }

}
