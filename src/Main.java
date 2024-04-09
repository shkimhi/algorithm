import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        int[]a = new int[8];
        int i=0; int n=55;
        while (  n>0 ) {
            a[i++] = ( n%2 );
            n /= 2;
        }
        for(i=7; i>=0; i--){
            System.out.print(a[i]);
        }
    }
}
