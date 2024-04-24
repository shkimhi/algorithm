import java.io.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());;
        int n[] = new int[5];
        int i;

        for(i = 0;i<5; i++){
            n[i] = Integer.parseInt(st.nextToken());
        }

        for(i=0; i<5; i++){
            System.out.println(n[(i+1)%5]);
        }

    }
}