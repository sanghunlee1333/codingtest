import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = {};
        
        List<String> list = new ArrayList<>();        
        String word = "";
        for(int i = 0; i < my_string.length(); i++) {
            char spel = my_string.charAt(i);
            if(spel != ' ') { //요소가 공백이 아니면
                word += spel; //word에 요소를 더해놓고
                if(!word.equals("") && i == my_string.length() - 1) { // 문자열의 마지막 요소까지 왔다면
                    list.add(word); //리스트에 단어를 넣고
                    word = ""; //초기화
                }
            }
            else if(spel == ' ' && !word.equals("")) { //공백이라면+word가 빈칸이 아닐때만
                list.add(word); //리스트에 단어를 넣고
                word = ""; //초기화
            }
            
        }
        answer = new String[list.size()];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}