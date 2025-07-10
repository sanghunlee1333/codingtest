class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        
        int sum = 0;
        for(int i = 0; i < numbers.length; i++) {
            if(n >= sum) {
                sum += numbers[i];
            }
            else break;
        }
        answer = sum;
        
        return answer;
    }
}