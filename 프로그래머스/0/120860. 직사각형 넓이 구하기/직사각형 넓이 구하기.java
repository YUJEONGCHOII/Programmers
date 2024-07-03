class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        int aMin, aMax, bMin, bMax = 0;
        
        aMin = dots[0][0];
        aMax = dots[0][0];
        bMin = dots[0][1];
        bMax = dots[0][1];
        
        for(int i=0; i<4; i++){
            if(dots[i][0] < aMin){
                aMin = dots[i][0];
            }
            
            if(dots[i][0] > aMax){
                aMax = dots[i][0];
            }
            
            if(dots[i][1] < bMin){
                bMin = dots[i][1];
            }
            
            if(dots[i][1] > bMax){
                bMax = dots[i][1];
            }
        }
        
        answer = (aMax-aMin) * (bMax-bMin);
        
        return answer;
    }
}