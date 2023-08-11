package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2744 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            // 대문자면 소문자로 바꾸기
            if (Character.isUpperCase(c)) {
                sb.append(Character.toLowerCase(c));
            } else {
                // 소문자면 대문자로 바꾸기
                sb.append(Character.toUpperCase(c));
            }
        }
        System.out.print(sb);

    }

}
