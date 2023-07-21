package three;

import java.io.*;
import java.util.StringTokenizer;

public class No2439 {
    public static int RightPrymid() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());

        for(int i = 1; i<a+1; i++){
            for(int k=0; k<a-i; k++){
                bw.write(" ");
            }
            for (int j=0; j < i; j++){
                bw.write("*");
            }
            bw.write("\n");
        }

        bw.close();

        return 0;
    }

}
