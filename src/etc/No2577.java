package etc;

import java.io.*;
import java.util.stream.Stream;

public class No2577 {
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int[] a = new int[3];
        int[] b = new int[10];
        int sum = 1;
        for(int i =0; i<a.length; i++ ){
            a[i] = Integer.parseInt(br.readLine());
            sum *= a[i];
        }
        int[] digits = Stream.of(String.valueOf(sum).split("")).mapToInt(Integer::parseInt).toArray();

        for(int i =0; i<digits.length; i++){
            b[digits[i]]++;
        }
        for(int i=0; i<b.length; i++){
            bw.write(String.valueOf(b[i])+"\n");
        }
        bw.close();
    }

}
