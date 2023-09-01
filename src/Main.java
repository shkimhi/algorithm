import java.io.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        processInput();
    }

    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum =0;
        int m = 0;
        int s = 0;

        for(int i =0; i<4; i++){
            int a = Integer.parseInt(br.readLine());
            sum += a;
        }

        m = sum/60;
        s = sum%60;

        bw.write(String.valueOf(m + "\n"));
        bw.write(String.valueOf(s));

        bw.close();

    }
}