class Solution {
    public int solution(int chicken) {
        int count = 0;
        int coupon = chicken;
        
        while(coupon>=10){
            int a = coupon/10; //쿠폰으로 시켜먹는 치킨 수
            int b = coupon%10; // 못 시킨 쿠폰 수
            count += a;
            coupon = a+b;
        }
        
        int answer = count;
        return answer;
    }
}