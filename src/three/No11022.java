package three;

import java.io.*;
import java.util.StringTokenizer;

public class No11022 {
    public static int testcase2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());

        for(int i =1; i<=a; i++){
            st = new StringTokenizer(br.readLine());
            int one = Integer.parseInt(st.nextToken());
            int two = Integer.parseInt(st.nextToken());
            bw.write("Case #"+ i +": "+one+" + "+two+" = "+(one+two)+"\n");
        }

        bw.close();

        return 0;
    }

}
