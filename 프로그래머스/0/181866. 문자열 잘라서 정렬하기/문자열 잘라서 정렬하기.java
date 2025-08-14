import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] answer = {};
        List<String> list = new ArrayList<>();        
        
        String word = "";
        for(int i = 0; i < myString.length(); i++) {
            char spel = myString.charAt(i);
            if(spel != 'x') {
                word += spel;
                if(i == myString.length() - 1) {
                    list.add(word);
                    word = "";    
                }
            }
            else {
                if(!word.isEmpty()) {
                    list.add(word);
                    word = "";
                }
            }
        }
        Collections.sort(list);
        
        answer = new String[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}