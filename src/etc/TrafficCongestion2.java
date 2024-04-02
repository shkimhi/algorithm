package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TrafficCongestion2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] car = new int[101][101];
        int n,m;
        n = Integer.parseInt(br.readLine());
        m = Integer.parseInt(br.readLine());

        for(int i=0; i<m; i++){
            int from, to, temp;
            st = new StringTokenizer(br.readLine());
            from = Integer.parseInt(st.nextToken());
            to = Integer.parseInt(st.nextToken());
            temp = Integer.parseInt(st.nextToken());
            if (car[from][to] == 0 || car[from][to] < temp) {
                car[from][to] = temp;
            }
        }


        for(int i =1; i<=n; i++){
            int in = 0, out = 0;
            for(int j = 1; j<=n; j++){
                in += car[j][i];
                out += car[i][j];
            }
            if( in > out) System.out.print(i+" ");
        }
    }
}
