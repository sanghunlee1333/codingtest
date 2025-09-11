class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        answer = new int[queries.length];
        
        for(int i = 0; i < queries.length; i++) {
            int num1 = queries[i][0];
            int num2 = queries[i][1];
            int k = queries[i][2];
            int min = Integer.MAX_VALUE;
            for(int j = num1; j <= num2; j++) {
                if(arr[j] > k) {
                    min = Math.min(min, arr[j]);
                }
            }
            answer[i] = min == Integer.MAX_VALUE ? -1 : min;
        }
        return answer;
    }
}