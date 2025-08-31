class Solution {
    public int solution(int n) {
        int answer = 0;
        int pizzaCount = 1;
        int slice = 6;
        
        while(pizzaCount * slice % n != 0) {
            pizzaCount++;
        }
        answer = pizzaCount;
        
        return answer;
    }
}