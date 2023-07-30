import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        processInput();
    }

    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int Row = 5;
        int Col = 15;
        String[][] str = new String[Row][Col];
        String input = null;
        for (int i = 0; i < Row ; i++) {
             input = br.readLine();
            for (int j = 0; j < input.length(); j++) {
                str[i][j] = String.valueOf(input.charAt(j));
            }
        }

        for(int i=0; i<Col; i++){
            for(int j=0; j<Row; j++){
                if(str[j][i] != null) {
                    String asd = str[j][i];
                    bw.write(asd);
                }
            }
        }

        bw.close();
    }
}

