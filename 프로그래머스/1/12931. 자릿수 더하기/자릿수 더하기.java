import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String str_n = Integer.toString(n);
        for(int i = 0; i < str_n.length(); i++) {
            char ch_num = str_n.charAt(i);
            answer += ch_num - '0';
        }

        return answer;
    }
}