package three;

import java.io.*;
import java.util.StringTokenizer;

public class No10951 {
    public static int AplusB() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1;
        String str;
        while ((str=br.readLine()) != null){
            st1 = new StringTokenizer(str);
            int num1 = Integer.parseInt(st1.nextToken());
            int num2 = Integer.parseInt(st1.nextToken());

            System.out.println(num1+num2);

        }

        bw.close();

        return 0;
    }

}
