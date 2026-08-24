class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer> smap= new HashMap<>();
        HashMap<Character,Integer> pmap= new HashMap<>();
        List<Integer> res= new ArrayList<>();
        if(s.length()<p.length())return res;

        for(int i=0;i<p.length();i++){
            pmap.put(p.charAt(i),pmap.getOrDefault(p.charAt(i),0)+1);
            smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
        }
        if(smap.equals(pmap))res.add(0);
         int l=0;
         int r= p.length();
         while(r<s.length()){
            char aq= s.charAt(r++);
            smap.put(aq,smap.getOrDefault(aq,0)+1);

            char dis =s.charAt(l++);
            smap.put(dis,smap.get(dis)-1);
            if(smap.get(dis)==0)smap.remove(dis);

             if(smap.equals(pmap))res.add(l);
         }
        
        return res;
    }
}