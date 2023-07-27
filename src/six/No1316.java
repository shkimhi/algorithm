package six;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

public class No1316 {
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int anwser = 0;
        for(int k = 0; k<n; k++) {
            String st = br.readLine();
            ArrayList<Character> al = new ArrayList<Character>();
            HashSet<Character> hs = new HashSet<Character>();
            int cnt = 0;
            for (int i = 0; i < st.length(); i++) {
                al.add(st.charAt(i));
                hs.add(st.charAt(i));
                if (i != 0) {
                    if (st.charAt(i) != st.charAt(i - 1) && al.contains(st.charAt(i))) {
                        cnt++;
                    }
                }
            }
            if (hs.size() == cnt + 1) {
                anwser++;
            }
        }

        bw.write(String.valueOf(anwser));
        bw.close();
    }

}
