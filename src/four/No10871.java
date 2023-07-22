package four;

import java.io.*;
import java.util.StringTokenizer;

public class No10871 {
    public static int array2() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int[] arr = new int[a];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < a; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] < b ){
                bw.write(String.valueOf(arr[i])+" ");
            }
        }


        bw.close();

        return 0;
    }


}
