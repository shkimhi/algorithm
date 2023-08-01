package etc;

import java.io.*;
import java.util.StringTokenizer;

public class No2745 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        String[] arr = new String[n.length()];
        int anwser = 0;
        arr = n.split("");

        for(int i =0, j=arr.length; i<arr.length; i++, j--){
            if(!isInteger(arr[i])){
                char currentChar = arr[i].charAt(0);
                if (currentChar >= 'A' && currentChar <= 'Z') {
                    int number = currentChar - 'A' + 10;
                    arr[i] = String.valueOf(number);
                }
            }
        }
        for(int i =0, j=arr.length; i<arr.length; i++, j--) {
            anwser += (int) (Integer.parseInt(arr[j-1]) * Math.pow(b,i));
        }
        bw.write(String.valueOf(anwser));
        bw.close();
    }
    public static boolean isInteger(String strValue) {
        try {
            Integer.parseInt(strValue);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }


}
