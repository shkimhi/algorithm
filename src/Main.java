import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        processInput();
    }

    public static void processInput() throws IOException {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();

        if (a.length() >= b.length()) {
            System.out.println("go");
        }else {
            System.out.println("no");
        }
    }
}