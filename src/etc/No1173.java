package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1173 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
       int N,m,M,T,R = 0;
       N = Integer.parseInt(st.nextToken());
       m = Integer.parseInt(st.nextToken());
       M = Integer.parseInt(st.nextToken());
       T = Integer.parseInt(st.nextToken());
       R = Integer.parseInt(st.nextToken());

       int cnt =0;
       int time = 0;
       int X = m;
       if(m+T > M){
           System.out.println(-1);
           return;
       }

       while (cnt < N){

           if(X < M && (X+T) <= M){
               X += T;
               cnt++;
           }else {
               X -= R;
               if(X < m){
                   X = m;
               }
           }
           time++;

       }
        System.out.println(time);


    }
}
