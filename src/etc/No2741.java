package etc;

import java.io.*;

public class No2741 {
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n; i++){
            bw.write(String.valueOf(i)+"\n");
        }

        bw.close();
    }

}
