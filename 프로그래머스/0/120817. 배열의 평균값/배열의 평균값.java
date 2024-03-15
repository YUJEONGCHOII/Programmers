class Solution {
    public double solution(int[] numbers) {
        double answer = 0;
        double length = numbers.length;
        double a = 0.0;
        for(int i=0; i<numbers.length; i++){
            a += (double)numbers[i];
        }
        answer = a/length;
        return answer;
    }
}