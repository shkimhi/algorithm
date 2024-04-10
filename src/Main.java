import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(br.readLine());
    List arr = new ArrayList();
    String name;
    for(int i =0; i<a; i++){
        name = br.readLine();
        arr.add(name.charAt(0));

    }


    }

}
