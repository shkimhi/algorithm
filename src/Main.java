import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String();
    }
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        String str1 = st.nextToken();
        String str2 = st.nextToken();

        StringBuffer st1 = new StringBuffer(str1);
        StringBuffer st2 = new StringBuffer(str2);
        String reverse1 = st1.reverse().toString();
        String reverse2 = st2.reverse().toString();

        if(Integer.parseInt(reverse1) > Integer.parseInt(reverse2)){
            bw.write(reverse1);
        }else{
            bw.write(reverse2);
        }
        bw.close();
    }
}
