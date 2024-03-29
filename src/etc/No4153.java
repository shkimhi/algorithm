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
            int max,pow;
            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if(a > b){
                max = a ;
                pow = (int) (Math.pow(b, 2) + Math.pow(c, 2));
            } else if (c > b) {
                max = c;
                pow = (int) (Math.pow(a, 2) + Math.pow(b, 2));
            }else {
                max = b;
                pow = (int) (Math.pow(a, 2) + Math.pow(c, 2));
            }

            if (pow == Math.pow(max, 2)) {
                bw.write("right\n");
            } else {
                bw.write("wrong\n");
            }
        }
        bw.close();
        br.close();
    }
}
