class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int a1 = common[1] - common[0];
        int a2 = common[2] - common[1];
        
        if(a1 == a2){
            answer = common[common.length-1] + a1;
        } else {
            a1 = common[1] / common[0];
            answer = common[common.length-1] * a1;
        }
        
        return answer;
    }
}