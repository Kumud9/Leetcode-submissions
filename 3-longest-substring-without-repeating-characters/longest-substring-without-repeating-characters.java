class Solution {
    public int lengthOfLongestSubstring(String s) {
       int [] arr= new int[256];// stores the last index where the char has appeared
    

       HashSet<Character> set = new HashSet<>();
       int l=0;int max=0;
       for(int r=0;r<s.length();r++){
        char ch= s.charAt(r);
        while(set.contains(ch)){
            set.remove(s.charAt(l));
            l++;
        }
       set.add(ch);
        max=Math.max(max,r-l+1);
       } 
       return max;
    }
}