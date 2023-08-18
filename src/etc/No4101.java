package etc;

import java.io.*;
import java.util.StringTokenizer;

public class No4101 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;
        while (true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a == 0 || b == 0){
                bw.close();
                return;
            }
            if(a > b){
                bw.write("Yes"+"\n");
            }else {
                bw.write("No"+"\n");
            }

        }
    }

}
