class Solution {
    public int[] solution(int[] arr) {
        int length = 0;
        
        for(int i=0; i<arr.length; i++){
            length += arr[i];
        }
        
        int[] answer = new int[length];
        
        int a = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i]; j++){
                answer[a++] = arr[i];
            }
        }
        return answer;
    }
}