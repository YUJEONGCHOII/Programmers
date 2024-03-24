class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        String[] arr = {};
        
        for(int a=i; a<=j; a++){
            arr = (a+"").split("");
            for(int b=0; b<arr.length; b++){
                if(arr[b].equals(k+"")) answer++;
            }
        }
        
        return answer;
    }
}