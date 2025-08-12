import java.util.*;
class Solution {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        
        List<String> list = new ArrayList<>();
        String word = "";
        for(int i = 0; i < my_string.length(); i++) {
            word += my_string.charAt(i);
            list.add(word);
        }
        
        if(list.contains(is_prefix)) {
            answer = 1;
        }
        else answer = 0;
        
        return answer;
    }
}