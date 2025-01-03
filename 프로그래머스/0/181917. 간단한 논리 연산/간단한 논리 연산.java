class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean x5 = true;
        boolean x6 = true;
        
        if(x1 == x2){
            x5 = x1;
        } else {
            x5 = true;
        }
        
        if(x3 == x4){
            x6 = x3;
        } else {
            x6 = true;
        }
        
        if(x5 == x6){
            answer = x5;
        } else {
            answer = false;
        }
        
        return answer;
    }
}