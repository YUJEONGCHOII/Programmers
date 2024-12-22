class Solution {
    public int[] solution(int[] arr) {
        int length = 1;
        
        while(length < arr.length){
            length *= 2;
        }
        
        int[] answer = new int[length];
        
        for(int i=0; i<answer.length; i++){
            if(i<arr.length){
                answer[i] = arr[i];
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }
}