package five;

import java.io.*;

public class No9086 {
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        for(int i = 0; i <a; i++) {
            String str = br.readLine();
            String start = str.substring(0,0+1);
            String end = str.substring(str.length()-1,str.length());
            bw.write(start+end+"\n");
        }
        bw.close();
    }

}
