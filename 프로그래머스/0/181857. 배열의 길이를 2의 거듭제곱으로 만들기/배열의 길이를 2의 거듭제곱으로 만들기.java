class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int len = arr.length;
        
        int num = 1;
        int square = 2;
        int count = 0;
        
        while(true) {
            if(len > num) {
                num *= square;
            }
            else if(len < num) {
                count = num - len;
                answer = new int[arr.length + count];
                for(int j = 0; j < arr.length; j++) {
                    answer[j] = arr[j];
                }
                break;
            }
            else {
                answer = arr;
                break;
            }
        }
        
        return answer;
    }
}