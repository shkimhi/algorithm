package etc;

import java.io.*;
import java.util.Arrays;

public class No2750_V2 {

    public void arr_sort() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for(int a : arr){
            bw.write(String.valueOf(a)+"\n");
        }
        bw.close();
        br.close();

    }

    public void bubbleSort() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int a = 0; a <arr.length; a++) {
            for (int i = 0, j = 1; j < arr.length; i++, j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int a : arr){
            bw.write(String.valueOf(a)+"\n");
        }
        bw.close();
        br.close();
    }
}
