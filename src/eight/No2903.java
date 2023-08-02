package eight;

import java.io.*;

public class No2903 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = 2;
        for(int i=0; i<a; i++){
            b = (b-1) + b;
        }
        bw.write(String.valueOf(b*b));


        bw.close();
    }

}
