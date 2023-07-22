package four;

import java.io.*;

public class No2562 {
    public static void array() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] a = new int[9];

        for(int i=0; i<a.length; i++){
            a[i] = Integer.parseInt(br.readLine());
        }

        int b =1;
        int max = a[0];
        for(int i =1; i<a.length; i++){
            int num = a[i];

            if(num > max){
                max = a[i];
                b = i+1;
            }
        }
        bw.write(String.valueOf(max)+"\n"+String.valueOf(b));

        bw.close();
    }

}
