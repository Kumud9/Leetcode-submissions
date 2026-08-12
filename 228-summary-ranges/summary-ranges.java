class Solution {
    public List<String> summaryRanges(int[] nums) {
          List<String> ans = new ArrayList<>();
        int i=0;
        while (i < nums.length) {
            int end = i;
            while (end + 1 < nums.length &&
                   nums[end] + 1 == nums[end + 1]) {
                end++;
            }
            if (i == end) {
                ans.add(String.valueOf(nums[i]));
            }
            else {
                ans.add(nums[i] + "->" + nums[end]);
            }
            i = end + 1;
        }

        return ans;
    }
}