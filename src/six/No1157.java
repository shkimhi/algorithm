package six;

import java.io.*;

public class No1157 {
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine().toUpperCase();

        int[] alphabetCount = new int[26];

        for (char c : word.toCharArray()) {
            if (Character.isAlphabetic(c)) {
                alphabetCount[c - 'A']++;
            }
        }

        char maxChar = '?';
        int maxCount = 0;

        for (int i = 0; i < 26; i++) {
            if (alphabetCount[i] > maxCount) {
                maxCount = alphabetCount[i];
                maxChar = (char) (i + 'A');
            } else if (alphabetCount[i] == maxCount) {
                maxChar = '?';
            }
        }

        bw.write(String.valueOf(maxChar));
        bw.close();
    }

}
