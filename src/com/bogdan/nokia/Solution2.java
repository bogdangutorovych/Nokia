package com.bogdan.nokia;
class Solution2 {
    
    static int solution(int[] A) {
        
        int i = 0;
        int lenthOfList = 0; 
        while (A[i] != -1 ) {
            i = A[i];
            lenthOfList++;
        }
        return ++lenthOfList;
    }

}