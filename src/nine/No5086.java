package nine;

import java.io.*;
import java.util.StringTokenizer;

public class No5086 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        while(true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            boolean c = false;
            if(a == 0 && b == 0)    break;
            for(int i = 1; i<=b; i++) {
                if(b%i == 0 && i==a){
                    bw.write("factor"+"\n");
                    c = true;
                    break;
                }
            }
            if(a%b == 0 && c == false)  bw.write("multiple"+"\n");
            if(a%b != 0 && c == false)  bw.write("neither"+"\n");
        }
        bw.close();
    }

}
