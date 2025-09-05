import java.util.*;

class Solution {
    public int solution(String my_string) {       
        List<Object> list = new ArrayList<>();
        my_string = my_string.replace(" ", "");
        
        String str_num = "";
        for(int i = 0; i < my_string.length(); i++) {
            char spel = my_string.charAt(i);
            if(Character.isDigit(spel)) {
                str_num += spel;
            }
            else {
                list.add(Integer.parseInt(str_num));
                str_num = "";              
                list.add(spel);
            }
        }
        if(!str_num.equals("")) {
            list.add(Integer.parseInt(str_num));
        }
        
        int answer = (int)list.get(0);
        for(int i = 1; i < list.size(); i += 2) {
            char operator = (char)list.get(i);
            int num = (int)list.get(i + 1);
            
            if(operator == '+') {
                answer += num;
            }
            else if(operator == '-') {
                answer -= num;
            }
        }
        
        return answer;
    }
}