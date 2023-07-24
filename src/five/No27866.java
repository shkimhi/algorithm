package five;

import java.io.*;

public class No27866 {
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int a = Integer.parseInt(br.readLine());

        String s = str.substring(a-1,a);

        bw.write(s);

        bw.close();



    }

}
