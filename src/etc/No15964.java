package etc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No15964 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(add(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken())));
    }
    private static int add(int a, int b){
        return (a+b)*(a-b);
    }
}
