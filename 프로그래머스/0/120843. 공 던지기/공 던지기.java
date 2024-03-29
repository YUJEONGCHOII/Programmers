class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int count = 2*(k-1);
        
        if(count>numbers.length){
            while(count>numbers.length){
                count -= numbers.length;
            }
        }
        
        answer = numbers[count];
        
        return answer;
    }
}