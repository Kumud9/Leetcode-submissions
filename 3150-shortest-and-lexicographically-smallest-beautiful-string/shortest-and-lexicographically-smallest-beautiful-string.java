class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n= s.length();
        int cnt=0;
        int min= Integer.MAX_VALUE;
        String ans= "";
        int left=0;
        for(int right=0;right<n;right++){
            if(s.charAt(right)=='1')cnt++;

            while(cnt>k){
                if(s.charAt(left)=='1')cnt--;

                left++;
            }
            if(cnt==k){
                while(s.charAt(left)=='0')left++;
            
            int len= right-left-1;
            String cand=s.substring(left,right+1);

                if (len < min || (len == min && cand.compareTo(ans)<0)) {

                    min=len;
                    ans = cand;
                  }  }
        }
        return ans;
    }
}