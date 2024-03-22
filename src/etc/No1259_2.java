package etc;

import java.io.*;
import java.util.StringTokenizer;

public class No1259_2 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(true){
            String str = br.readLine();

            if(str.equals("0")){
                break;
            }
            StringBuffer sb = new StringBuffer(str);
            String reverse = sb.reverse().toString();

            if(str.equals(reverse)){
                bw.write("yes"+"\n");
            }else {
                bw.write("no"+"\n");
            }
        }

        bw.close();
    }

}
