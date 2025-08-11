import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = new int[num_list.length];
        
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int i = 0; i < num_list.length; i++) {
            if(i < n) {
                list1.add(num_list[i]);
            }
            else list2.add(num_list[i]);
        }
        for(int i = 0; i < list1.size(); i++) {
            list2.add(list1.get(i));
        }
        for(int i = 0; i < list2.size(); i++) {
            answer[i] = list2.get(i);
        }
        
        return answer;
    }
}