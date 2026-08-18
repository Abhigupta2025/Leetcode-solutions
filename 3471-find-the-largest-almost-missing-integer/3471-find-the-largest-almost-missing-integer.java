class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer , Boolean > map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num , false );
            }
            else{
                map.put(num , true);
            }
        }

        int n = nums.length;
        if(k == 1){
            int max = -1;
            for(int i : nums){
                if(map.get(i)){
                    max = Math.max(max , i);
                }
            }
            return Math.max(max , -1);
        }
        else if(k == n){
            int m = -1;
            for(int i : nums){
                if(i>m){
                    m = i;
                }
            }
            return m ;

        }

        else if(k < n){
            int a = nums[0];
            int b = nums[n-1];
            int m = -1 ;
            if(map.get(a)){
                m = Math.max( m , a);
            }
            if(map.get(b)){
                m = Math.max(m , b);
            }
            return m;


        }

        return (-1);
        
    }
}