import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        list.add(n);
        while(n != 1) {
            if(n % 2 == 0) {
                n = n / 2;
                list.add(n);
            }
            else { 
                n = 3 * n + 1;
                list.add(n);
            }
        }
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}