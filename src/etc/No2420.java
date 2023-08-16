package etc;

import java.io.*;
import java.util.StringTokenizer;

public class No2420 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        bw.write(String.valueOf(Math.abs(a - b)));
        bw.close();
    }

    }
