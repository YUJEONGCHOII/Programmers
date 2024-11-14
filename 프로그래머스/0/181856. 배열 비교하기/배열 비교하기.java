class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        
        if(arr1.length != arr2.length){
            if(arr1.length > arr2.length){
                answer = 1;
            } else {
                answer = -1;
            }
        } else {
            int arr1Num = 0;
            int arr2Num = 0;
            
            for(int i=0; i<arr1.length; i++){
                arr1Num += arr1[i];
                arr2Num += arr2[i];
            }
            
            if(arr1Num > arr2Num){
                answer = 1;
            } else if(arr1Num < arr2Num){
                answer = -1;
            } else {
                answer = 0;
            }
        }
        
        return answer;
    }
}