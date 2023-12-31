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

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int sum = 0;
        sum = a<b ? a : b;
        sum = sum<c ? sum : c;

        int d = Integer.parseInt(br.readLine());
        int e = Integer.parseInt(br.readLine());

        sum += d<e ? d:e;
        bw.write(String.valueOf(sum-50));


        bw.close();


    }
}