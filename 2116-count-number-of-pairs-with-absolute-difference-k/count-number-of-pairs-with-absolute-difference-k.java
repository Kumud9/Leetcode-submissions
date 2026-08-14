class Solution {
    public int countKDifference(int[] nums, int k) {
       int n= nums.length;int count=0;
    Map<Integer,Integer>map= new HashMap<>();
    for(int i=0;i<n;i++){
         if(map.containsKey(nums[i]+k)){
            count+=map.get(nums[i]+k);
         }
              if(map.containsKey(nums[i]-k)){
            count+=map.get(nums[i]-k);
         }
         map.put(nums[i],map.getOrDefault(nums[i],0)+1);
    }

    return count;
    }
}