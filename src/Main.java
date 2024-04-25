import java.io.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        int a[] = new int[8];
        int i = 0, n = 11;
        while (n > 0) {
            a[i++] = n % 2;
            n /= 2;
        }
        for (i = 7; i >= 0; i--)
            System.out.printf("%d", a[i]);
    }

    }

