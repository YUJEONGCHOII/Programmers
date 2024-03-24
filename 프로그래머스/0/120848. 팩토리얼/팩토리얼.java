class Solution {
    public int solution(int n) {
        int answer = 0;
        int a = 1;
        
        for(int i=1; ; i++){
            for(int j=i; j>=1; j--){
                a *= j;
            }
            if(a>n){
                answer = i-1;
                break;
            }
            a = 1;
        }
        
        return answer;
    }
}