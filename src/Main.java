import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        int i = 0;
        int sum =0;
        while (i<10){
            i++;
            if(i%2 == 1){
                continue;
            }
            sum += i;
        }
        System.out.println(sum);
    }
}
