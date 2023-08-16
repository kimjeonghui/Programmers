
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int N;
    static int[] parent; //부모노드 저장
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> list; //노드 저장
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N= Integer.valueOf(scanner.nextLine());
        visited = new boolean[N+1];
        list = new ArrayList<>();
        parent = new int[N+1];

        for(int i=0; i<N+1; i++){
            list.add(i, new ArrayList<>());
        }

        for(int i=0; i<N-1; i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

          list.get(a).add(b);
          list.get(b).add(a);

        }

        dfs(1);

        for(int i=2; i<parent.length; i++){
            System.out.println(parent[i]);
        }
    }

    public static void dfs(int index){
        visited[index] = true;
        for(int i: list.get(index)){
            if(!visited[i]){
                parent[i] = index;
                dfs(i);
            }
        }
    }
}
