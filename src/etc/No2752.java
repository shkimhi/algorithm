package etc;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class No2752 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int arr[] = new int[3];

        for (int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        Arrays.sort(arr);
        for(int i : arr)
            bw.write(String.valueOf(i)+" ");

        bw.close();

    }

}
