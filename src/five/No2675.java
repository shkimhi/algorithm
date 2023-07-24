package five;

import java.io.*;
import java.util.StringTokenizer;

public class No2675 {
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());
        int b = 0;
        String[] str;
        for(int i =0; i<a; i++) {
            st = new StringTokenizer(br.readLine());
            b = Integer.parseInt(st.nextToken());
            str = st.nextToken().split("");
            for(int j = 0; j< str.length; j++){
                for(int k=0; k<b; k++){
                    bw.write(str[j]);
                }
            }
            bw.write("\n");
        }

        bw.close();

    }

}
