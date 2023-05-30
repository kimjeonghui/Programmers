import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        ArrayList<String> ans = new ArrayList<String>(Arrays.asList(myStr.split("a|b|c")));
        ans.removeAll(Arrays.asList("", null));

        answer = ans.toArray(new String[ans.size()]);
        
        if(answer.length == 0 ) return new String[]{"EMPTY"};
        
//         List<String> list = new ArrayList<>();
//         while(myStr.length()!=0){
//             for(int i=0; i<myStr.length(); i++){
//                 char c = myStr.charAt(i);
//                 if(c== 'a' || c == 'b' || c == 'c'){
//                 if(i == 0){
//                      myStr= myStr.substring(1, myStr.length());

//                 }
//                 else{
//                     list.add(myStr.substring(0, i));
//                     myStr= myStr.substring(i+1, myStr.length());
//                 }
//                 break;
//                 }
                
//             }
//         }
//         if(list.size() ==0 ) answer = new String[]{"EMPTY"};
//         else{
//             answer = list.toArray(new String[list.size()]);
//         }
        
        
        return answer;
    }
}