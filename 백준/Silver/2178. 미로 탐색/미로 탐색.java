import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static int[][] matrix;
    static int r;
    static int l;
    static boolean[][] isVisited;
    static int[] dx = { -1, 1, 0, 0 }; //x방향배열
    static int[] dy = { 0, 0, -1, 1 }; //y방향배열

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        l = Integer.parseInt(st.nextToken());

        matrix = new int[r][l];
        isVisited = new boolean[r][l];

        for(int i=0; i<r; i++){
            String s = br.readLine();
            for(int j=0; j<l; j++){
                matrix[i][j] = s.charAt(j) -'0';
            }
        }
        isVisited[0][0] = true;
        bfs(0,0);
        System.out.println(matrix[r-1][l-1]);
    }

    public static void bfs(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});

        while(!queue.isEmpty()){
            int []current = queue.poll();
            int currentX = current[0];
            int currrentY = current[1];
            for(int i=0; i<4; i++){
                int nextX = currentX +dx[i];
                int nextY = currrentY +dy[i];
                if(nextX <0 || nextY <0 || nextX >= r || nextY >=l ){
                    continue;
                }
                if(isVisited[nextX][nextY]==true || matrix[nextX][nextY] == 0)  continue;

                queue.add(new int[]{nextX, nextY});
                matrix[nextX][nextY] = matrix[currentX][currrentY] +1;
                isVisited[nextX][nextY] = true;
            }
        }
    }
}
