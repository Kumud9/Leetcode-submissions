class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map= new HashMap<>();
        HashSet<Integer> set= new HashSet<>();
        List<Integer> l0= new ArrayList<>();
        List<Integer> l1= new ArrayList<>();
        List<List<Integer>> res= new ArrayList<>();  

        for(int i[]: matches){
            int w=i[0];
            int l= i[1];

            set.add(w);
            set.add(l);

            map.put(l,map.getOrDefault(l,0)+1);
        }

        for(int c: set){
            int loss= map.getOrDefault(c,0);
            if(loss==0)l0.add(c);
            else if(loss==1)l1.add(c);
        }
        Collections.sort(l0);
        Collections.sort(l1);

        res.add(l0);
        res.add(l1);

        return res;
    }
}