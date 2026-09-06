import java.util.Scanner;
public class Main {
    public static final int INT_MAX = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n+1];
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        
        int answer = INT_MAX;
        for (int i=1; i<=n; i++) {
            int sum = 0;
            for (int j=1; j<=n; j++) {
                sum += Math.abs(i-j) * a[j];
            }

            answer = Math.min(answer, sum);
        }

        System.out.println(answer);
    }
}