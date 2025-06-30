import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> str = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            if(str.isEmpty()) {
                str.add(arr[i]);
            }
            else if(!str.isEmpty() && str.get(str.size() - 1) == arr[i]) {
                str.remove(str.size() - 1);
            }
            else if(!str.isEmpty() && str.get(str.size() - 1) != arr[i]) {
                str.add(arr[i]);
            }
        }
        
        if(str.size() != 0) {
            answer = new int[str.size()];
            for(int i = 0; i < answer.length; i++) {
                answer[i] = str.get(i);
            }
        }
        else {
            answer = new int[1];
            answer[0] = -1;
        }
        
        return answer;            
        
    }
}