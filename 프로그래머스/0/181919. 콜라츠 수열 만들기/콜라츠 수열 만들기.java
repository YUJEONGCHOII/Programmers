class Solution {
    public int[] solution(int n) {
        int count = 1;
        int n2 = n;
        
        while(n2!=1){
            if(n2%2 == 0){
                n2 /= 2;
                count++;
            } else {
                n2 = 3*n2+1;
                count++;
            }
        }
        
        int[] answer = new int[count];
        answer[0] = n;
        int a = 1;
        
        while(n!=1){
            if(n%2 == 0){
                n /= 2;
                answer[a++] = n;
            } else {
                n = 3*n+1;
                answer[a++] = n;
            }
        }
        return answer;
    }
}