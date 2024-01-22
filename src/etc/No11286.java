package etc;

import java.io.*;
import java.util.PriorityQueue;

public class No11286 {
    public void process() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> myqueue = new PriorityQueue<>((o1,o2) -> {
            int a = Math.abs(o1);
            int b = Math.abs(o2);
            if(a == b){
                return o1 > o2 ? 1 : -1;
            }
            return a - b;
        });

        for(int i = 0; i < N; i++){
            int C = Integer.parseInt(br.readLine());
            if(C == 0){
                if(myqueue.isEmpty()){
                    bw.write("0\n");
                }else {
                    bw.write(myqueue.poll() +"\n");
                }
            }else {
                myqueue.add(C);
            }
        }
        bw.close();
        br.close();
    }
}
