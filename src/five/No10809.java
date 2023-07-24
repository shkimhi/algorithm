package five;

import java.io.*;

public class No10809 {
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        int[] arr = new int[26];

        for(int i=0; i<26; i++){
            arr[i] = -1;
        }

        for(int i=0; i<word.length(); i++){
            char ch = word.charAt(i);
            int a = ch - 'a';

            if(arr[a] == -1) {
                arr[a] = i;
            }
        }

        for(int i=0; i<arr.length; i++){
            bw.write(String.valueOf(arr[i])+" ");
        }
        bw.close();

    }

}
