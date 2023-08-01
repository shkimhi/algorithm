import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        processInput();
    }

    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        while(n > 0){
            if(n == 4 || n == 7)
            {
                sum = -1;
                break;
            }
            if(n%5 == 0 ){
                sum += n/5;
                break;
            }
            n -= 3;
            sum++;
        }
        bw.write(String.valueOf(sum));

        bw.close();
    }
}

