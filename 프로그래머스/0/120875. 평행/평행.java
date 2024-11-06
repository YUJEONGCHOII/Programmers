class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        double a = (double)(dots[0][1]-dots[1][1])/(double)(dots[0][0]-dots[1][0]);
        double b = (double)(dots[0][1]-dots[2][1])/(double)(dots[0][0]-dots[2][0]);
        double c = (double)(dots[0][1]-dots[3][1])/(double)(dots[0][0]-dots[3][0]);
        double d = (double)(dots[1][1]-dots[2][1])/(double)(dots[1][0]-dots[2][0]);
        double e = (double)(dots[1][1]-dots[3][1])/(double)(dots[1][0]-dots[3][0]);
        double f = (double)(dots[2][1]-dots[3][1])/(double)(dots[2][0]-dots[3][0]);
        
        answer = (a==f || b==e || c==d) ? 1:0;
        
        return answer;
    }
}