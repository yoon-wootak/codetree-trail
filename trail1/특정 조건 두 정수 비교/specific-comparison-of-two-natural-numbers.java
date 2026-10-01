import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a < b) 
            System.out.print(1);
        else
            System.out.print(0);

        System.out.print(" ");

        if (a == b) 
            System.out.print(1);
        else
            System.out.print(0);
    }
}