class Solution {
    public int[] solution(int n) {
        int length = 0;
        int a = 0;
        
        if(n%2 == 0){
            length = n/2;
        } else {
            length = n/2+1;
        }
        
        int[] answer = new int[length];
        
        for(int i=1; i<=n; i++){
            if(i%2 != 0){
                answer[a++] = i;
            }
        }
        
        return answer;
    }
}