class Solution {
    public boolean isPalindrome(String s) {
  
        int start=0;
        int last= s.length()-1;

        while(start< last){
       while(start< last && !Character.isLetterOrDigit(s.charAt(start)))start++;
         while(start< last && !Character.isLetterOrDigit(s.charAt(last)))last--;

          if(Character.toLowerCase(s.charAt(start))!=Character.toLowerCase(s.charAt(last)))return false;

          start++;last--;
 
 
        }

        return true;
    // int l=0;
    // int r=s.length()-1;
    // return fun(s,l,r);
        
    }

    // public boolean fun(String s, int l, int r){
    //     if(l>=r)return true;

    //     if(!Character.isLetterOrDigit(s.charAt(l)))
    //     return fun(s,l+1,r);

    //       if(!Character.isLetterOrDigit(s.charAt(r)))
    //     return fun(s,l,r-1);

    //     if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r)))return false;

    //     return fun(s,l+1,r-1);

    
}