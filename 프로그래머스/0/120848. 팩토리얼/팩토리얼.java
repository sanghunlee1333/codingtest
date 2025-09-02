class Solution {
    public int solution(int n) {
        int answer = 0;
        
        int num = 1;
        int mul = 1;
        while(n > mul) {
            mul *= num;
            if(n < mul) {
                num--;
                break;
            }
            else if(n == mul) {
                break;
            }
            else {
                num++;
            }
        }
        answer = num;
        
        return answer;
    }
}