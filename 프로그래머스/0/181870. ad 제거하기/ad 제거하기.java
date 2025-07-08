import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        
        List<String> new_list = new ArrayList<>();
        
        for(int i = 0; i < strArr.length; i++) {
            new_list.add(strArr[i]);
        }
        
        for(int i = new_list.size() - 1; i >= 0; i--) {
            if(new_list.get(i).contains("ad")) {
                new_list.remove(i);
            }
        }
        
        answer = new String[new_list.size()];     
        for(int i = 0; i < answer.length; i++) {
            answer[i] = new_list.get(i);    
        }
        
        return answer;
    }
}