import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        Deque<Integer> queue = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < prices.length; i++) {
            //if(i != prices.length-1)queue.add(0);
            for (int j = i ; j < prices.length-1; j++) {
                if (i == prices.length - 1) {
                    break;
                }
                if (prices[i] > prices[j]) {
                    break;
                } else {
                    queue.add(0);
                }


            }
                list.add(queue.size());
                queue.clear();
        }
        System.out.println(list.stream().mapToInt(i -> i).toArray());
        return list.stream().mapToInt(i -> i).toArray();
//         Stack<Integer> beginIdxs = new Stack<>();
//         int i=0;
//         int[] terms = new int[prices.length];

//         beginIdxs.push(i);
//         for (i=1; i<prices.length; i++) {
//             while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
//                 int beginIdx = beginIdxs.pop();
//                 terms[beginIdx] = i - beginIdx;
//             }
//             beginIdxs.push(i);
//         }
//         while (!beginIdxs.empty()) {
//             int beginIdx = beginIdxs.pop();
//             terms[beginIdx] = i - beginIdx - 1;
//         }

//         return terms;
    }
}
      