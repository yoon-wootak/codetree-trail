import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine()) + 87;
        int B = Integer.parseInt(br.readLine()) % 10;

        System.out.println(A);
        System.out.println(B);
    }
}