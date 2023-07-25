package five;

import java.io.*;

public class No5622 {
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int second = 0;

        for(int i =0, j = 3; i<str.length(); i++ , j++){
            char ch = str.charAt(i);
            if(ch == 'A' || ch == 'B'|| ch == 'C'){
                second += 3;
            } else if (ch == 'D' || ch == 'E'|| ch == 'F') {
                second += 4;
            } else if (ch == 'G' || ch == 'H'|| ch == 'I') {
                second += 5;
            }else if (ch == 'J' || ch == 'K'|| ch == 'L') {
                second += 6;
            }else if (ch == 'M' || ch == 'N'|| ch == 'O') {
                second += 7;
            }else if (ch == 'P' || ch == 'Q'|| ch == 'R' || ch == 'S') {
                second += 8;
            }else if (ch == 'T' || ch == 'U'|| ch == 'V') {
                second += 9;
            }else if (ch == 'W' || ch == 'X'|| ch == 'Y'|| ch == 'Z') {
                second += 10;
            }
        }

        bw.write(String.valueOf(second));

        bw.close();

    }

}
