class Solution {
    public int firstStableIndex(int[] nums, int k) {
            int n = nums.length;
        int mini = Integer.MAX_VALUE;int maxi = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            maxi = Math.max(maxi, nums[i]);
            mini = nums[i];
            for(int j=i; j<n; j++){
                mini = Math.min(mini, nums[j]);
            }
            int score  = maxi - mini;
            if(score<=k) return i;
        }
        return -1;
    }
}