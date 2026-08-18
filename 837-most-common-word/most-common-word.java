class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String low= paragraph.toLowerCase();
        String [] words= low.split("[^a-z]+");
        HashSet<String> set= new HashSet<>();
        for(String w: banned){
            set.add(w);
        }
        HashMap<String,Integer> map= new HashMap<>();
        for(String w: words){
            if(set.contains(w))continue;

            map.put(w,map.getOrDefault(w,0)+1);
        }
        String ans = "";
        int max = 0;
        for (String word : map.keySet()) {
            if (map.get(word)> max) {
                max=map.get(word);
                ans = word;
            }
        }
        return ans;
    }
}