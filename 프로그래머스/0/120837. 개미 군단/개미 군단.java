class Solution {
    public int solution(int hp) {
        int answer = 0;
        int hp2, hp3 = 0;
        
        answer = hp/5;
        hp2 = hp%5;
        
        answer += hp2/3;
        hp3 = hp2%3;
        
        answer += hp3;
        
        return answer;
    }
}