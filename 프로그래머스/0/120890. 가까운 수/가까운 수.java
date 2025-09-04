class Solution {
    public int solution(int[] array, int n) {
        int minDiff = Math.abs(array[0] - n);
        int answer = array[0];       
        
        for(int i = 1; i < array.length; i++) {
            int diff = Math.abs(array[i] - n);
            if(minDiff > diff) {
                minDiff = diff;
                answer = array[i];
            }
            else if(minDiff == diff) {
                if(array[i] < answer) {
                    answer = array[i];
                }
            }
        }
        
        return answer;
    }
}