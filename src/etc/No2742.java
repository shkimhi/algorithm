package etc;

import java.io.*;

public class No2742 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        while (a > 0){
            bw.write(String.valueOf(a)+"\n");
            a--;
        }
        bw.close();

    }

}
