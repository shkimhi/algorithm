package etc;

import java.util.*;

public class No14235 {
    static PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
    static int n;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        while(n-->0) {
            int a=sc.nextInt();

            if(a==0) {
                if(pq.isEmpty())
                    System.out.println(-1);
                else
                    System.out.println(pq.poll());
            }
            else {
                for(int i=0;i<a;i++)
                    pq.add(sc.nextInt());
            }
        }
    }


}
