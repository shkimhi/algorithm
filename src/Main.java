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
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger a = BigInteger.valueOf(Long.parseLong(st.nextToken()));
        BigInteger b = BigInteger.valueOf(Long.parseLong(st.nextToken()));

        bw.write(String.valueOf(a.divide(b))+"\n");
        bw.write(String.valueOf(a.remainder(b)));

        bw.close();


    }
}