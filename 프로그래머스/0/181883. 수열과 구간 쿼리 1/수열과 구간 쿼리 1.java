class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int j = 0; j < queries.length; j++) {
            int s = queries[j][0];
            int e = queries[j][1];
            
            for(int i = s; i <= e; i++) {
                arr[i]++;
            }
                
        }
        answer = arr;
        
        return answer;
    }
}