class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        int size = num_list.length - (n - 1);
        answer = new int[size];
        for(int i = 0; i < size; i++) {
            answer[i] = num_list[n - 1 + i];
        }
        return answer;
    }
}