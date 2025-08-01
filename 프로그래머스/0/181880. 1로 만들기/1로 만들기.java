class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int i = 0; i < num_list.length; i++) {
            int num = num_list[i];
            while(num != 1) {
                if(num % 2 == 0 && num != 1) {
                    num = num / 2;
                    answer++;            
                }
                else if(num % 2 != 0 && num != 1) {
                    num = (num - 1) / 2;
                    answer++;
                }
            }
        }
        return answer;
    }
}