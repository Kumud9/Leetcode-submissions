class Solution {
    public int splitArray(int[] nums, int k) {
      int r=0;int l= 0;
      for(int i=0;i<nums.length;i++){
         r += nums[i];
         l=Math.max(l,nums[i]);
         }  
      while(l<=r){
        int mid=l+(r-l)/2;
     if(check(nums,k,mid)){
        r=mid-1;
     }else  l=mid+1;
      }
return l;
    
    }
    public boolean check(int [] nums, int k, int mid){
        // whether nums can we divided into k subarrays so that we can get largest sum that is minimum
   int kreq=1;
   int sum=0;
       for(int i=0;i<nums.length;i++){
         if(nums[i]+ sum<= mid){
            sum+=nums[i];
         }else{
            kreq++;
            sum=nums[i];
         }
       }   
       return kreq<=k;
    }
}