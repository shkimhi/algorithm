package four;

import java.io.*;
import java.util.StringTokenizer;

public class No10810 {
    public static void array() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[a];

        for(int n =0; n<b; n++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for(int m=i-1; m<j; m++){
                arr[m] = k;
            }
        }
        for(int i =0 ; i<arr.length; i++) {
            bw.write(String.valueOf(arr[i]+" "));
        }
        bw.close();
    }

}
