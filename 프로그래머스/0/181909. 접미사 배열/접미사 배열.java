import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        answer = new String[my_string.length()];
        
        List<String> list = new ArrayList<>();
        String word = "";
        for(int i = my_string.length() - 1; i >= 0; i--) {
            word = my_string.charAt(i) + word;
            list.add(word);
        }        
        Collections.sort(list);
        
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}