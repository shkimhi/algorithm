package etc;

import java.io.*;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class No1978 {
    public void process() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int isPN;
        int cnt=0;
        for(int i=0; i<num; i++){
            isPN = Integer.parseInt(st.nextToken());
            for(int p=2; p<=isPN; p++){
                if(p == isPN){
                    cnt++;
                }
                if(isPN % p == 0){
                    break;
                }
            }
        }
        System.out.println(cnt);
    }
}
