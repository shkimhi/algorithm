package six;

import java.io.*;

public class No3003 {
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int[] arr2 = {1,1,2,2,2,8};
        int[] cnt = new int[6];

        for(int i=0; i<arr.length; i++){
            int a = Integer.parseInt(arr[i]);
            cnt[i] = arr2[i] - a;
        }

        for(int i=0; i<arr.length; i++){
            bw.write(String.valueOf(cnt[i])+" ");
        }
        bw.close();
    }
}


/*
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int[] arr2 = {1,1,2,2,2,8};
        int[] cnt = new int[6];
        for(int i =0; i<arr.length; i++){
            int a = Integer.parseInt(arr[i]);
            if(a < arr2[i]){
                while (true){
                    if(a == arr2[i]){
                        break;
                    }
                    a += 1;
                    cnt[i] += 1;
                }
            }else {
                while (true){
                    if(a == arr2[i]) {
                        break;
                    }
                    a -= 1;
                    cnt[i] -= 1;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            bw.write(String.valueOf(cnt[i])+" ");
        }
        bw.close();
    }
*/
