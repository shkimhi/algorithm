import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String();
    }
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringBuffer sb = new StringBuffer(str);
        String reverse = String.valueOf(sb.reverse());

        if(str.equals(reverse)){
            bw.write("1");
        }else {
            bw.write("0");
        }

        bw.close();
    }
}

