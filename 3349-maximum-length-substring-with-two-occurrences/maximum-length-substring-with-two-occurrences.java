class Solution {
    public int maximumLengthSubstring(String s) {
        int l=0;
        int r=0;
        int [] freq= new int [26];
        int ans=0;
        while(r<s.length()){
            char ch= s.charAt(r);
            freq[ch-'a']++;
            while(freq[ch-'a']>2){
              freq[s.charAt(l)-'a']--;
              l++;
            }
            r++;
            ans= Math.max(ans,r-l);
        }
        return ans;
    }
}