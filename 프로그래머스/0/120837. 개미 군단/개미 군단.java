class Solution {
    public int solution(int hp) {
        int answer = 0;
        
        int count = 0;
        while(hp > 0) {
            count += hp / 5;
            hp %= 5;
            if(hp / 5 == 0) {
                count += hp / 3;
                hp %= 3;
                if(hp / 3 == 0) {
                    count += hp / 1;
                    hp %= 1;
                    break;
                }
            }
        }
        answer = count;
        
        return answer;
    }
}