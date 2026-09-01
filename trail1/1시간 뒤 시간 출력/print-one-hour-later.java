import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] arr = s.split(":");

        System.out.println((Integer.parseInt(arr[0])+1) + ":" + arr[1]);
    }
}