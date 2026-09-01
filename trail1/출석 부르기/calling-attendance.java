import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        if (a == 1) {
            System.out.println("John");
        }
        else if (a == 2) {
            System.out.println("Tom");
        }
        else if (a == 3){
            System.out.println("Paul");
        }
        else {
            System.out.println("Vacancy");
        }
    }
}