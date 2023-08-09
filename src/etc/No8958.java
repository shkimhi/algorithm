package etc;

import java.io.*;
import java.util.StringTokenizer;

public class No8958 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int a = Integer.parseInt(br.readLine());
        for(int i =0; i<a; i++){
            String str = br.readLine();
            int cnt = 0;
            int cnt2= 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'O'){
                    cnt2++;
                    cnt += cnt2;
                }else cnt2 =0;
            }
            bw.write(String.valueOf(cnt)+"\n");
        }
        bw.close();
    }
}
