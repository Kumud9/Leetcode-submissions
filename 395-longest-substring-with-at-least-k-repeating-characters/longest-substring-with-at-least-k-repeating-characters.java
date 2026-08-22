class Solution {
    public int longestSubstring(String s, int k) {
         if(s.length()<0)return 0;

        HashMap<Character,Integer>map=new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);

        }
for(char ch: map.keySet()){
          if (map.get(ch) < k) {
                int max = 0;
                String[] parts = s.split(String.valueOf(ch));
                for (String part : parts) {
                    max = Math.max(max, longestSubstring(part, k));
                }

                return max;
            }
}
return s.length();
    }
}