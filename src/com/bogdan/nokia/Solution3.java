package com.bogdan.nokia;
import java.math.BigInteger;

class Solution3 {
    
    static int solution(int N) {
        
        final BigInteger BASE = BigInteger.valueOf(11);
        final char NUMBER = '1';
        
        BigInteger result = BASE.pow(N);
        String stringResult = result.toString();
        
        int count = 0;
        for (int i = 0; i < stringResult.length(); i++) {
            if (stringResult.charAt(i) == NUMBER) {
                count++;
            }
            
        }
        return count;
    }

}