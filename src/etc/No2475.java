package etc;

import java.io.*;

public class No2475 {
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int sum = 0;

        for(int i =0; i<arr.length; i++){
            sum += (int) Math.pow(Integer.parseInt(arr[i]),2);
        }
        bw.write(String.valueOf(sum%10));
        bw.close();
    }

}
