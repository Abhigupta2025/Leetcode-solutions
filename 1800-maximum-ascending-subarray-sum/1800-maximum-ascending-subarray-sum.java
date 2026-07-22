class Solution {
    public int maxAscendingSum(int[] nums) {
        int subarrsum = nums[0];
        int max = nums[0];
        for(int i = 1;i<nums.length;i++){
            if(nums[i] >nums[i-1]){
                subarrsum+= nums[i];
            }
            else{
                subarrsum = nums[i];
            }
            max = Math.max(subarrsum , max);
        }
        return max;
    }
}