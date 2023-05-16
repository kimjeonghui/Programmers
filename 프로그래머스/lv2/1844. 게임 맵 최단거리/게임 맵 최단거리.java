import java.util.*;

class Solution {
    private static final int WALL = 0;
    private static final int PATH = 1;

    public int solution(int[][] maps) {
        int answer = -1;

        int rows = maps.length;
        int cols = maps[0].length;

        int[][] visited = new int[rows][cols]; // 방문 여부 체크를 위한 배열
        visited[0][0] = 1; // 시작 위치 방문 표시

        Queue<int[]> queue = new LinkedList<>(); // BFS를 위한 큐
        queue.add(new int[]{0, 0});

        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // 아래, 오른쪽, 위, 왼쪽

        while (!queue.isEmpty()) {
            int size = queue.size();
            answer++; // 단계별로 이동 거리를 측정하기 위해 1씩 증가

            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();

                // 목적지에 도착한 경우 종료
                if (current[0] == rows - 1 && current[1] == cols - 1)
                    return answer + 1;

                for (int[] direction : directions) {
                    int nextRow = current[0] + direction[0];
                    int nextCol = current[1] + direction[1];

                    // 다음 위치가 유효하고, 벽이 아니며, 방문하지 않은 경우 큐에 추가
                    if (nextRow >= 0 && nextRow < rows && nextCol >= 0 && nextCol < cols &&
                            maps[nextRow][nextCol] == PATH && visited[nextRow][nextCol] == 0) {
                        visited[nextRow][nextCol] = 1; // 다음 위치 방문 표시
                        queue.add(new int[]{nextRow, nextCol});
                    }
                }
            }
        }

        return -1; // 도착할 수 없는 경우
    }
}
