import java.util.*;

class Solution {
    public int[] solution(int n) {
        int[] answer = {};
                
        Set<Integer> set = new TreeSet<>();
        
        int num = 2;
        while(n > 1) {
            if(n % num == 0) {
                set.add(num);
                n = n / num;
                num = 2;
            }
            else {
                num++;
            }
        }
        
        answer = new int[set.size()];
        int index = 0;
        for(int i : set) {
            answer[index++] = i;
        }
        
        return answer;
    }
}