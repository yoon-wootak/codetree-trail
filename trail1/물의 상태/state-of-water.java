import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        if (a < 0) {
            System.out.println("ice");
        }
        else if (a >= 100) {
            System.out.println("vapor");
        }
        else {
            System.out.println("water");
        }
    }
}