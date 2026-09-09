class Solution {
    public long countCommas(long n) {
        long count  =0, p = 1000;
        while(p <= n){
            count += n-p+1;
            p *= 1000;
        }
        return count;
        
    }
}