import java.io.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        processInput();
    }

    public static void processInput() throws IOException {
        Scanner sc = new Scanner(System.in);
        int n, s;
        while (sc.hasNext()) {
            n = sc.nextInt();
            s = sc.nextInt();
            System.out.println(s / (n + 1));
        }
    }
}