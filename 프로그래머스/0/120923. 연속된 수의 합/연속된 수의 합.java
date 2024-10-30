class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        if(total%num == 0){
            answer[num/2] = total/num;
            
            for(int i=num/2+1; i<answer.length; i++){
                answer[i] = answer[i-1] + 1;
            }
            
            for(int j=num/2-1; j>=0; j--){
                answer[j] = answer[j+1] - 1;
            }
        } else {
            answer[num/2-1] = total/num;
            
            for(int i=num/2; i<answer.length; i++){
                answer[i] = answer[i-1] + 1;
            }
            
            for(int j=num/2-2; j>=0; j--){
                answer[j] = answer[j+1] - 1;
            }
        }
        
        return answer;
    }
}