package etc;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class No2920_2 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;

        ArrayList<Integer> arr = new ArrayList<Integer>();
        st = new StringTokenizer(br.readLine());
        int cnt =0;
        int cnt2 = 0;
        for(int i =0; i<8; i++){
            arr.add(i, Integer.parseInt(st.nextToken()));
        }
        for(int i =0, j=1, k=8 ; i<8; i++,j++,k--) {
            if (j == arr.get(i)) {
                cnt++;
            }else if(k == arr.get(i)){
                cnt2++;
            }
        }
        if(cnt == 8){
            bw.write("ascending");
        } else if (cnt2 == 8) {
            bw.write("descending");
        }else {
            bw.write("mixed");
        }

        bw.close();

    }

}
