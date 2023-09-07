package etc;

import java.io.*;

public class No1100 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str[] = new String[8];
        int i = 0;
        int answer = 0;
        while (i<8){
            str = br.readLine().split("");
            if(i%2 == 0) {
                for (int j = 0; j < 8; j += 2) {
                    if (str[j].equals("F")) {
                        answer++;
                    }
                }
            }else {
                for(int j = 1; j<8; j+=2){
                    if(str[j].equals("F")){
                        answer++;
                    }
                }
            }
            i++;
        }
        bw.write(String.valueOf(answer));
        bw.close();
    }
}
