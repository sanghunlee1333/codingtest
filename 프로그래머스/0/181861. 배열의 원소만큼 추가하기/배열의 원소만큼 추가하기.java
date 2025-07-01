class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int size = 0;
        for(int i = 0; i < arr.length; i++) {
            size += arr[i];
        }
        answer = new int[size];
        int count = 0;
        
        for(int i = 0; i < size; ) {
            for(int j = 0; j < arr.length; ) {
                if(count < arr[j]) {
                    answer[i] += arr[j];
                    count++;
                    i++;
                }
                else {
                    j++;
                    count = 0;
                }
            }
        }
        
        
        return answer;
    }
}