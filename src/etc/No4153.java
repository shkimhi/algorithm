package etc;

import java.io.*;
import java.util.StringTokenizer;

public class No4153 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            int pow = (int) (Math.pow(a, 2) + Math.pow(b, 2));

            if (pow == Math.pow(c, 2)) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }
        bw.close();
        br.close();
    }
}
