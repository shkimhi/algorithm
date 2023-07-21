package three;

import java.io.*;
import java.util.StringTokenizer;

public class No10952 {
    public static int AplusB() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1;

        while (true){
            st1 = new StringTokenizer(br.readLine());

            int if1 = Integer.parseInt(st1.nextToken());
            int if2 = Integer.parseInt(st1.nextToken());

            if (if1 == 0 && if2 ==0){
                break;
            }else {
                System.out.println(if1+if2);
            }
        }

        bw.close();

        return 0;
    }

}
