package seven;

import java.io.*;
import java.util.StringTokenizer;

public class No2738 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st= new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[][] arr = new int[a][b];
        int[][] arr2 = new int[a][b];

        for(int i=0; i<a; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<b; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i=0; i<a; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<b; j++) {
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                int sum = arr[i][j] + arr2[i][j];
                bw.write(sum + " ");
            }
            bw.write("\n");
        }


        bw.close();
    }

}
