package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1268 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int studnet = Integer.parseInt(br.readLine());
        int[][] studentarr = new int[studnet][5];

        for (int i = 0; i < studnet; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                studentarr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int max = -1;
        int president = -1;

        for (int i = 1; i < studnet; i++) {
            int cnt = 0;
            for (int j = 0; j < studnet; j++) {
                if (i == j) continue;
                for (int k = 0; k < 5; k++) {
                    if (studentarr[i][k] == studentarr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                president = i + 1;
            }
        }
        System.out.println(president);
    }
}
