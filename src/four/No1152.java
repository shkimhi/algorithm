package four;

import java.io.*;

public class No1152 {
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        if(input == null || input.isBlank()){
            bw.write("0");
        }else {
            String[] arr = input.split( " ");
            if(arr[0].isEmpty()) {
                bw.write(String.valueOf(arr.length - 1));
            }else {
                bw.write(String.valueOf(arr.length));
            }
        }

        bw.close();
    }


}
