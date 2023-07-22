package four;

import java.io.*;
import java.util.StringTokenizer;

public class No10813 {
    public static void array() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = 0;
        int[] arr = new int[a];
        for(int i=1; i<=arr.length; i++){
            arr[i-1] = i;
        }

        for(int n =0; n<b; n++){
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            c = arr[i-1];
            arr[i-1] = arr[j-1];
            arr[j-1] = c;
        }
        for(int i =0 ; i<arr.length; i++) {
            bw.write(String.valueOf(arr[i]+" "));
        }
        bw.close();
    }

}
