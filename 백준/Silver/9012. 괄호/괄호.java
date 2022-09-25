import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        //스택에 ( 쌓기
        //)가 나오면 스택에 pop
        //Stirng이 끝날 때까지 반복
        //반복이 종료됐을 때 스택이 비어있으면 YES
        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());
        String[] tf = new String[n];

        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < n; i++) {
            stack.clear();
            String s = scan.nextLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(') {
                    stack.add('(');
                } else { //s가  )인 경우
                    if (stack.isEmpty()) {
                        //System.out.println("NO");
                        tf[i] = "NO";
                        
                        break;

                    } else {
                        stack.pop();

                    }

                }
                    //마지막 차례일때


                if (j == s.length() - 1) {
                    if(stack.isEmpty()) tf[i] = "YES";//System.out.println("YES");
                    else {
                        tf[i] = "NO";//System.out.println("NO");
                    }

                }
                }
            }
             for(int k=0; k<tf.length; k++){
                 System.out.println(tf[k]);
             }

        }

    }

