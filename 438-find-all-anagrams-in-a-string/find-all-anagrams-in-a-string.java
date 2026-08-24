class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> map= new HashMap<>();
        List<Integer> res= new ArrayList<>();
        if(s.length()<p.length())return res;

        for(int i=0;i<p.length();i++){
            map.put(p.charAt(i),map.getOrDefault(p.charAt(i),0)+1);
           
        }
    

         int l=0;
         int r= 0;
         int cnt=p.length();
         while(r<s.length()){
            char ch= s.charAt(r);
            if(map.containsKey(ch)){
                if(map.get(ch)>0)cnt--;
                map.put(ch,map.get(ch)-1);
            }
            r++;

            if(r-l>p.length()){
                 char left= s.charAt(l);
            if(map.containsKey(left)){
                map.put(left,map.get(left)+1);

                 if(map.get(left)>0)cnt++;
            }
            l++;
            }

           if (cnt==0)res.add(l);
         }
        
        return res;
    }
}