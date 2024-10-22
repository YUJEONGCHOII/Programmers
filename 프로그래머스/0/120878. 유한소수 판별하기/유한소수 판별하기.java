import java.util.*;

class Solution {
    public int solution(int a, int b) {
        List<Integer> aArr = new ArrayList<>(); // a의 약수 배열
        List<Integer> bArr = new ArrayList<>(); // b의 약수 배열
        List<Integer> abArr = new ArrayList<>(); // a, b의 공약수 배열
        
        for(int i=1; i<=a; i++){
            if(a%i==0){
                aArr.add(i);
            }
        }
        
        for(int j=1; j<=b; j++){
            if(b%j==0){
                bArr.add(j);
            }
        }
        
        if(aArr.size() >= bArr.size()){
            for(int i=0; i<aArr.size(); i++){
                for(int j=0; j<bArr.size(); j++){
                    if(aArr.get(i) == bArr.get(j)){
                        abArr.add(bArr.get(j));
                    }
                }
            }
        } else if(aArr.size() < bArr.size()){
            for(int i=0; i<bArr.size(); i++){
                for(int j=0; j<aArr.size(); j++){
                    if(bArr.get(i) == aArr.get(j)){
                        abArr.add(aArr.get(j));
                    }
                }
            }
        }
        
        int ab = abArr.get(abArr.size()-1); // a, b의 최대공약수
        int c = b/ab; // 기약분수의 분모
        
        List<Integer> cArr = new ArrayList<>(); // c의 소인수 배열
        
        for(int i=2; i<=c; i++){
            if(c%i == 0){
                while(c%i == 0){
                    c /= i;
                }
                cArr.add(i);
            }
        }
        
        int answer = 1;
        
        for(int i= 0; i<cArr.size(); i++){
            if(!(cArr.get(i) == 1 || cArr.get(i) == 2 || cArr.get(i) == 5)){
                answer = 2;
                break;
            }
        }
        
        return answer;
    }
}