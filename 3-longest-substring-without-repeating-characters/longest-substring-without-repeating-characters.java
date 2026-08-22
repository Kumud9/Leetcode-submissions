class Solution {
    public int lengthOfLongestSubstring(String s) {
       int [] arr= new int[256];// stores the last index where the char has appeared
       Arrays.fill(arr,-1);
       int l=0;int max=0;
       for(int r=0;r<s.length();r++){
        char ch= s.charAt(r);
        if(arr[ch]!= -1){
            l=Math.max(l,arr[ch]+1);

        }
        arr[ch]=r;
        max=Math.max(max,r-l+1);
       } 
       return max;
    }
}