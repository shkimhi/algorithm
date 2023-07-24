package four;

import java.io.*;
import java.util.StringTokenizer;

public class No10811 {
    public static void array() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[a];

        for(int i=0; i<arr.length; i++){
            arr[i] = i+1;
        }

        for( int i =0; i<b; i++){
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            for(int j = c-1, k = d-1; j < k; j++, k--){
                int e = arr[j];
                arr[j] = arr[k];
                arr[k] = e;
            }
        }

        for(int i=0; i<arr.length; i++){
            bw.write(String.valueOf(arr[i])+" ");
        }

        bw.close();
    }

}
