package six;

import java.io.*;
import java.util.StringTokenizer;

public class No25206 {
    public static void String() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        double answer = 0;
        int sum = 0;
        for(int i=0; i<20; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            double credit = Double.parseDouble(st.nextToken());
            String grade_s = st.nextToken();
            double grade = 0;
            if (grade_s.equals("A+")) {
                grade = 4.5;
            } else if (grade_s.equals("A0")) {
                grade = 4.0;
            } else if (grade_s.equals("B+")) {
                grade = 3.5;
            } else if (grade_s.equals("B0")) {
                grade = 3.0;
            } else if (grade_s.equals("C+")) {
                grade = 2.5;
            } else if (grade_s.equals("C0")) {
                grade = 2.0;
            } else if (grade_s.equals("D+")) {
                grade = 1.5;
            } else if (grade_s.equals("D0")) {
                grade = 1.0;
            } else if (grade_s.equals("F")) {
                grade = 0;
            }
            if(!grade_s.equals("P")) {
                answer += grade * credit;
                sum += credit;
            }

        }
        bw.write(String.valueOf(answer/sum));

        bw.close();

    }

}
