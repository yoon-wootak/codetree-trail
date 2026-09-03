import java.util.*;
import java.io.*;

public class Main {
    static int N;

    static boolean in_range(int x, int y) {
        return x >= 1 && x <= N && y >= 1 && y <= N;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        char D = st.nextToken().charAt(0);
        
        int dir_num;

        // if (D.equals("U")) dir_num = 0;
        // else if (D.equals("R")) dir_num = 1;
        // else if (D.equals("D")) dir_num = 2;
        // else if (D.equals("L")) dir_num = 3;

        HashMap<Character, Integer> hm = new HashMap<>();
        String arr = "URDL";

        for (int i=0; i<arr.length(); i++) {
            hm.put(arr.charAt(i), i);
        }

        dir_num = hm.get(D);

        //위 오른쪽 아래 왼쪽
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        
        for (int i=0; i<T; i++) {
            int nx = x + dx[dir_num];
            int ny = y + dy[dir_num];

            if (in_range(nx, ny)) {
                x += dx[dir_num];
                y += dy[dir_num];
            }
            else {
                dir_num = (dir_num + 2) % 4;
            }
        }

        System.out.println(x + " " + y);
    }
}
