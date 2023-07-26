package six;

import java.io.*;

public class No2941 {
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch1 = str.charAt(i);
            if(i == str.length()-1) {
                cnt++;
                break;
            }
            char ch2 = str.charAt(i + 1);
            if (ch1 == 'c' && ch2 == '=') {
                cnt++;
                i++;
            } else if (ch1 == 'c' && ch2 == '-') {
                cnt++;
                i++;
            } else if (ch1 == 'd' && ch2 == 'z' && i + 2 < str.length() && str.charAt(i+2) == '=') {
                cnt++;
                i += 2;
            } else if (ch1 == 'd' && ch2 == '-') {
                cnt++;
                i++;
            } else if (ch1 == 'l' && ch2 == 'j') {
                cnt++;
                i++;
            } else if (ch1 == 'n' && ch2 == 'j') {
                cnt++;
                i++;
            } else if (ch1 == 's' && ch2 == '=') {
                cnt++;
                i++;
            } else if (ch1 == 'z' && ch2 == '=') {
                cnt++;
                i++;
            }else {
                cnt++;
            }
        }

        bw.write(String.valueOf(cnt));


        bw.close();
    }

}
