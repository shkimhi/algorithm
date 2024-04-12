import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(br.readLine());
    HashMap<Character, Integer> map = new HashMap<>();
    String name;

    for(int i =0; i<a; i++){
        name = br.readLine();
        if(map.containsKey(name.charAt(0))){
            map.put(name.charAt(0),map.get(name.charAt(0))+1);
        }else {
            map.put(name.charAt(0),1);
        }
    }

    int cnt =0;
    for(Character key : map.keySet()){
        if(map.get(key) >= 5){
            System.out.print(key);
            cnt++;
        }
    }

    if(cnt == 0){
        System.out.println("PREDAJA");
    }

    }

}
