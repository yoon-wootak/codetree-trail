import java.util.*;

public class Main {
    public static int n;
    public static ArrayList<Node>[] graph;
    public static long[] dist;

    public static class Node implements Comparable<Node> {
        int id;
        long dist;

        Node(int id, long dist) {
            this.id = id;
            this.dist = dist;
        }

        @Override
        public int compareTo(Node o) {
            return Long.compare(this.dist, o.dist);
        }
    }

    public static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>();

        dist = new long[n+1];
        Arrays.fill(dist, Long.MAX_VALUE);
    
        pq.offer(new Node(start, 0));
        dist[start] = 0;

        while(!pq.isEmpty()) {
            Node cur = pq.poll();

            if (cur.dist > dist[cur.id]) continue;

            for (Node next : graph[cur.id]) {
                long distSum = cur.dist + next.dist;
                if (distSum < dist[next.id]) {
                    dist[next.id] = distSum;
                    pq.offer(new Node(next.id, distSum));
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int m = sc.nextInt();

        graph = new ArrayList[n+1];
        for (int i=1; i<=n; i++) {
            graph[i] = new ArrayList<>();
        }   

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int d = sc.nextInt();

            graph[b].add(new Node(a, d));
        }

        dijkstra(n);

        long max = Long.MIN_VALUE;
        for (int i=1; i<n; i++) {
            if (dist[i] == Long.MAX_VALUE) continue;

            max = Math.max(max, dist[i]);
        }

        System.out.println(max);
    }
}