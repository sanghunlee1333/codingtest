import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        for(int n : arr) {
            list.add(n);
        }
        
        for(int i = 0; i < query.length; i++) {
            if(i % 2 == 0) {
                list = list.subList(0, query[i] + 1);
            }
            else {
                list = list.subList(query[i], list.size());
            }
        }
        answer = new int[list.size()];
        int i = 0;
        for(int n : list) {
            answer[i++] = n;
        }
        
        return answer;
    }
}