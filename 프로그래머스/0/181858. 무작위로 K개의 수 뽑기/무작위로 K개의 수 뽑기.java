import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        
        Set<Integer> set = new LinkedHashSet<>();
        for(int n : arr) {
            set.add(n);
        }
        
        int i = 0;
        for(int n : set) {
            if(i == k) break;
            answer[i++] = n;
        }
        
        if(i < k) {
            for(int j = i; j < answer.length; j++) {
                answer[j] = -1;
            }
        }
        return answer;
    }
}