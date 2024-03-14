package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1978_v2 {
    public void process() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        boolean pN[] = new boolean[1001];
        pN[1] = true;
        for(int i=2; i*i<=1000; i++)
            if(!pN[i])
                for(int j=i*i; j<=1000; j+=i)
                    pN[j] = true;
        int cnt=0;
        String list[] = br.readLine().split(" ");
        for(int i=0; i<list.length; i++){
            if(!pN[Integer.parseInt(list[i])])
                cnt++;
        }
        System.out.println(cnt);
    }
}
