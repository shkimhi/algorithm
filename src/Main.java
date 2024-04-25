import java.io.*;
import java.math.BigInteger;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {

    int c = 0;
    for(int i = 1; i<=2023; i++){
        if(i%4 == 0) c++;
    }
        System.out.println(c);
    }
}