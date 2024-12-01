class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int x = 1;
        int sumX = 0;
        
        for(int i=0; i<num_list.length; i++){
            x *= num_list[i];
            sumX += num_list[i];
        }
        
        sumX *= sumX;
        
        if(x < sumX){
            answer = 1;
        }
        
        return answer;
    }
}