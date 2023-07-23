package four;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class No3052 {
    public static void array() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int[] arr = new int[10];
        int[] arr2 = new int[10];


        for(int i = 0; i < arr.length; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<arr.length; i++){
            arr2[i] = arr[i] % 42;
        }

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }

        bw.write(String.valueOf(set.size()));
        bw.close();


        bw.close();
    }

}
