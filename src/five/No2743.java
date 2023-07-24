package five;

import java.io.*;

public class No2743 {
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        bw.write(String.valueOf(str.length()));
        bw.close();


    }

}
