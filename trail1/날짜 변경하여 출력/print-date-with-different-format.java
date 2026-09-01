import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        String[] arr = s.split("\\.");

        System.out.println(arr[1] + "-" + arr[2] + "-" + arr[0]);
    }
}