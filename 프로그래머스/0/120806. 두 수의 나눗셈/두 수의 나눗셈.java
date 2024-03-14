class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        
        double Dnum1 = (double)num1;
        double Dnum2 = (double)num2;
        
        answer = (int)((Dnum1/Dnum2)*1000);
        return answer;
    }
}