package eight;

import java.io.*;

public class No2720 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        for(int i =0; i<a; i++){
            int b = Integer.parseInt(br.readLine());

            int Quarter = b/25;
            int Dime = (b%25)/10;
            int Nickel = ((b%25)%10)/5;
            int Penny = (((b%25)%10)%5)/1;

            bw.write(String.valueOf(Quarter)+" "+String.valueOf(Dime)+" "+String.valueOf(Nickel)+" "+String.valueOf(Penny)+"\n");
        }

        bw.close();
    }

}
