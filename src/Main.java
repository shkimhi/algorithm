import java.io.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

        System.out.println(f(4));

    }

    static int f(int n){
        if(n==1){
            return 1;
        }else {
            return f(n-1) + (n-3);
        }
    }
}