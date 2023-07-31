package seven;

import java.io.*;
import java.util.StringTokenizer;

public class No2563 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        boolean[][] arr = new boolean[101][101];

        int a = Integer.parseInt(br.readLine()) ;
        int cnt =0;
        for(int i=0; i<a; i++){
            st = new StringTokenizer(br.readLine());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            for(int j = b; j<b+10; j++){
                for(int k=c; k<c+10; k++){
                    if(!arr[j][k]) {
                        arr[j][k] = true;
                        cnt++;
                    }
                }
            }
        }
        bw.write(String.valueOf(cnt));

        bw.close();
    }

}
