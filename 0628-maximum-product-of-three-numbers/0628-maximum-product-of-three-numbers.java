class Solution {
    public int maximumProduct(int[] arr) {
        int max1 = Integer.MIN_VALUE,max2 =Integer.MIN_VALUE,max3 =Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE,min2 =Integer.MAX_VALUE;
        for(int i = 0; i<arr.length;i++ ){
            // FOR maximum case 
            if(max1<=arr[i]){
                max3 = max2;
                max2 = max1;
                max1 = arr[i]; 
            }
            else if(max2 <= arr[i]){
                max3 = max2;
                max2 = arr[i];
            }
            else if(max3< arr[i]){
                max3 = arr[i];
            }
            // FOR MINIMUM CASE 
            if(min1>= arr[i]){
                min2 = min1;
                min1 = arr[i];
            }
            else if(min2>arr[i]){
                min2 = arr[i];
            }

        }
        return Math.max(max1*max2*max3, max1*min1*min2);
        
    }
}