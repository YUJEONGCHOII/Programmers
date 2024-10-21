class Solution {
    public int solution(int n) {
        int[] arr = new int[100];
        arr[0] = 1;
        
        int number = 0;
        String strNumber = "";
        
        for(int i=1; i<100; i++){
            number = arr[i-1] + 1;
            strNumber = number + "";
            
            while(number%3==0 || strNumber.contains("3")){
                number++;
                strNumber = number + "";
            }
            
            arr[i] = number;
        }
        
        int answer = arr[n-1];
        return answer;
    }
}