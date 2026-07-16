class Solution {
    public int gcdOfOddEvenSums(int n) {
        int n1 = 1, n2 = 2,s1 =0,s2 = 0 ;
        if(n <= 1) return 1;
        while(n-- >0){
            s1+= n1;
            n1+= 2;
            s2+= n2;
            n2+= 2;
        }
        int min = Math.min(s1,s2);
        int max = Math.max(s1,s2);
        int a = min , gcd = 1;
        while(a-- >0) {
            if(max%a == 0 && min%a == 0){
                gcd = a;
                break;
            }
        }
        return gcd;
    }
}