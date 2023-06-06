import java.util.*;

class Solution {
    public int[][] solution(int n) {
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, -0}}; // Right, Down, Left, Up
        boolean[][] visited = new boolean[n][n];
        int[][] answer = new int[n][n];
        int num = 1;
        int direction = 0;
        int col = 0;
        int row = 0;

        while (num <= n * n) {
            // Mark current cell as visited and store the number
            visited[col][row] = true;
            answer[col][row] = num;

            // Calculate next cell coordinates
            int nextCol = col + directions[direction][0];
            int nextRow = row + directions[direction][1];

            // Check if next cell is within the matrix bounds and not visited
            if (nextCol >= 0 && nextCol < n && nextRow >= 0 && nextRow < n && !visited[nextCol][nextRow]) {
                col = nextCol;
                row = nextRow;
            } else {
                // Change direction
                direction = (direction + 1) % 4;
                col += directions[direction][0];
                row += directions[direction][1];
            }

            num++;
        }

        return answer;
    }
}

// import java.util.*;
// /*
// 1  2  3  4
// 12 13 14 5
// 11 16 15 6
// 10  9  8  7
// */

// class Solution {
//     public int[][] solution(int n) {
//         int[][] directions ={{1,0}, {0,1}, {-1, 0}, {0, -1}}; //우, 하 ,좌, 상
//         boolean [][] visited = new boolean[n][n];
//         int[][] answer = new int[n][n];
//         int num =1;
//         int direction = 0; 
//         int col= 0;
//         int row = 0;
//         while(num<=n*n){
//             //direction
//             int nextCol = col + directions[direction][0];
//             int nextRow = row + directions[direction][1];
//             answer[col][row] = num;
//             visited[col][row] = true;
            
//              if(nextCol >=n || nextRow >=n || nextCol <=-1 || nextRow <= -1){
//                  direction = (direction+1)%4;
//             }else{
//                if(visited[nextCol][nextRow] == false){
//                 col =  nextCol;
//                 row = nextRow;
//                 num++;
//                 }
               
//             }
            
// //             if(nextCol <n && nextRow <n && nextCol >-1 && nextRow > -1){
// //                 if(visited[nextCol][nextRow] == false){
// //                 col =  nextCol;
// //                 row = nextRow;
// //                 num++;
// //                 }
// //                 else{direction = (direction+1)/4;}
             
// //             }else{
// //                 direction = (direction+1)/4;
// //             }
//         }
//         return answer;
//     }
// }