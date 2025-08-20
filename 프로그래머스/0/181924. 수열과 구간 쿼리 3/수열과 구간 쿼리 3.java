class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        int[] numbers = new int[2];
        int count = 0;
        for(int i = 0; i < queries.length; i++) {
            for(int j = 0; j < queries[i].length; j++) {
                numbers[count] = queries[i][j];
                if(count == 0) {
                    count++;
                }
            }
            int temp = arr[numbers[0]];
            arr[numbers[0]] = arr[numbers[1]];
            arr[numbers[1]] = temp;
            count = 0;
        }
        answer = arr;
        
        return answer;
    }
}