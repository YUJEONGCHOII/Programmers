class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int side1 = sides[0];
        int side2 = sides[1];
        if(sides[0]<sides[1]){
            side1 = sides[1];
            side2 = sides[0];
        }
        
        for(int i=side1-side2+1; i<side1+side2; i++){
            answer++;
        }
        
        return answer;
    }
}