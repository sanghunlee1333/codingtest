import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++) {
            String str = intStrs[i].substring(s, s + l);
            int strNum = Integer.parseInt(str);
            if(strNum > k) {
                list.add(strNum);
            }
        }
        answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++) {
            answer[i] += list.get(i);
        }
        
        return answer;
    }
}