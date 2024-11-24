class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt((a+"")+(b+""));
        int ba = Integer.parseInt((b+"")+(a+""));
        
        int answer = 0;
        if(ab >= ba){
            answer = ab;
        } else {
            answer = ba;
        }
        
        return answer;
    }
}