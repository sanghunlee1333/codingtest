import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < strArr.length; i++) {
            int len = strArr[i].length();
            if(!map.containsKey(len)) {
                map.put(len, 1);
            }
            else {
                map.put(len, map.get(len) + 1);
            }
        }
        
        int max = 1;
        for(int count : map.values()) {
            if(count > max) {
                max = count;
            }
        }
        answer = max;
        
        return answer;
    }
}