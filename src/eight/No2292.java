package eight;

import java.io.*;

public class No2292 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = 1;
        int c = 2;

        if(a == 1){
            bw.write("1");
        }else {
            while (c <= a){
                c = c+(6*b);
                b++;
            }
            bw.write(String.valueOf(b));
        }

        bw.close();

    }


}
