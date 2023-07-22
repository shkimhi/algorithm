package four;

import java.io.*;
import java.util.StringTokenizer;

public class No10807 {
    public static int array() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < a; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int b = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == b ){
                cnt ++;
            }
        }
        bw.write(String.valueOf(cnt));


        bw.close();

        return 0;
    }

}
