package eight;

import java.io.*;
import java.util.Locale;
import java.util.StringTokenizer;

public class No11005 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());

        String s = Integer.toString(Integer.parseInt(N),B);

        bw.write(s.toUpperCase(Locale.ROOT));
        bw.close();
    }

}
