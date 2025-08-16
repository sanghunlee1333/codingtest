class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        answer = new int[arr.length];
        
        int len = arr.length;
        if(len % 2 == 0) {
            for(int i = 0; i < arr.length; i++) {
                if(i % 2 != 0) {
                    arr[i] += n;
                    answer[i] = arr[i];
                }
                else {
                    answer[i] = arr[i];
                }
            }
        }
        else {
            for(int i = 0; i < arr.length; i++) {
                if(i % 2 == 0) {
                    arr[i] += n;
                    answer[i] = arr[i];
                }
                else {
                    answer[i] = arr[i];
                }
            }
        }
        
        return answer;
    }
}