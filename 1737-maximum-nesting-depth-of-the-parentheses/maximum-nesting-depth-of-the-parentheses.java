class Solution {
    public int maxDepth(String s) {
       int cnt=0;
       int maxd=0;
       for(char ch: s.toCharArray()){
        if(ch=='('){
            cnt++;
            if(maxd< cnt)maxd = cnt;
        }else if(ch==')'){
        cnt--;
        }
       } 
       return maxd;
    }
}