class Solution {
    public int solution(String[] order) {
        int answer = 0;
        
        for(int i = 0; i < order.length; i++) {
            if(order[i].contains("ice")) {
                order[i] = order[i].replace("ice", "");
            }
            else if(order[i].contains("hot")) {
                order[i] = order[i].replace("hot", "");
            }
            
            if(order[i].equals("americano") || order[i].equals("anything")) {
                answer += 4500;
            }
            else if(order[i].equals("cafelatte")) {
                answer += 5000;
            }
        }
        
        return answer;
    }
}