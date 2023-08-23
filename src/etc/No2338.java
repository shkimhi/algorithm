package etc;

import java.io.*;
import java.math.BigInteger;

public class No2338 {
    public static void processInput() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // A 입력 받기
        BigInteger A = new BigInteger(br.readLine());

        // B 입력 받기
        BigInteger B = new BigInteger(br.readLine());

        // A + B 계산 및 출력
        BigInteger sum = A.add(B);
        bw.write(sum.toString());
        bw.newLine();

        // A - B 계산 및 출력
        BigInteger difference = A.subtract(B);
        bw.write(difference.toString());
        bw.newLine();

        // A * B 계산 및 출력
        BigInteger product = A.multiply(B);
        bw.write(product.toString());
        bw.newLine();

        // 버퍼 비우고 닫기
        bw.flush();
        bw.close();
        br.close();

    }

}
