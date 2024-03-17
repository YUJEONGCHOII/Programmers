class Solution {
    public int solution(int price) {
        int answer = 0;
        double dPrice = 0.0;
        if(price >= 100000 && price < 300000){
            dPrice = price * 0.95;
            answer = (int)dPrice;
        } else if(price >= 300000 && price < 500000){
            dPrice = price * 0.9;
            answer = (int)dPrice;
        } else if(price >= 500000){
            dPrice = price * 0.8;
            answer = (int)dPrice;
        } else {
            answer = price;
        }
        
        return answer;
    }
}