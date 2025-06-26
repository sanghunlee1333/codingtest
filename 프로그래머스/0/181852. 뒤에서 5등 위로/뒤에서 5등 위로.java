class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = {};
        
        int size = num_list.length - 5;
        answer = new int[size];
        
        java.util.Arrays.sort(num_list);
        
        for(int i = 0; i < size; i++){
            answer[i] = num_list[i + 5];
        }
        return answer;
    }
}