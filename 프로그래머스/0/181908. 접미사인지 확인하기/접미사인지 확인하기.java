import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        String word = "";
        List<String> list = new ArrayList<>();
        for(int i = my_string.length() - 1; i >= 0; i--) {
            word = my_string.charAt(i) + word;
            list.add(word);
        }
        for(String str : list) {
            if(str.equals(is_suffix)) {
                return answer = 1;
            }
        }
        
        return answer;
    }
}