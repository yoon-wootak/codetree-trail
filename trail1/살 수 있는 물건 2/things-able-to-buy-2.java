import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        if (N >= 3000) {
            System.out.println("book");
        }
        else if (N >= 1000) {
            System.out.println("mask");
        }
        else if (N >= 500) {
            System.out.println("pen");
        }
        else {
            System.out.println("no");
        }
    }
}