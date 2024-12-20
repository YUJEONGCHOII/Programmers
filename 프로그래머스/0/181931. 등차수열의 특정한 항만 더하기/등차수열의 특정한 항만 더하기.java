class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int n = 0;
        
        for(int i=0; i<included.length; i++){
            if(i==0){
                n += a;
            } else {
                n += d;
            }
            
            if(included[i]){
                answer += n;
            }
        }
        
        return answer;
    }
}