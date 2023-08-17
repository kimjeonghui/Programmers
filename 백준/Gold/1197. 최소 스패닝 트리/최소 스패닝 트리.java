import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int V, E, parents[];
    static Edge[] edgeList;
    static class Edge implements Comparable<Edge> {
        int from, to, weight;

        public Edge(int from, int to, int weight) {
            super();
            this.from = from;
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge o) {
            return Integer.compare(this.weight, o.weight);
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            V = sc.nextInt(); //정점
            E = sc.nextInt(); //간선
            edgeList = new Edge[E];
            parents = new int[V + 1];

            //edge정보 입력
            for (int i = 0; i < E; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();

                edgeList[i] = new Edge(a, b, c);
            }

            System.out.println(kruskal());

        }
    

        private static int kruskal(){
            int res =0, cnt =0;

            //오름차순 정렬
            Arrays.sort(edgeList);
            //정점 초기화
            make();
            
            for(Edge e: edgeList){
                if(union(e.from, e.to)){
                    res += e.weight;
                    if(++cnt == E-1 ) return res;
                }
            }
            return res;
        }
        
        private static boolean union(int a, int b){
        int aRoot = find(a);
        int bRoot = find(b);
        
        if(aRoot == bRoot) return false;
        if(aRoot>= bRoot) parents[aRoot] = bRoot;
        else parents[bRoot] = aRoot;
        return true;
        }
        
        private static int find(int i){
        if(i == parents[i]) return i;
        return find(parents[i]);
        }
    
        private static void make() {
            for (int i = 1; i <= V; i++) {
                parents[i] = i;
            }
    }
}