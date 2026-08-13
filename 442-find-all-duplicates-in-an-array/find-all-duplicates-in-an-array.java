class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list= new ArrayList<>();
        Map<Integer,Integer>map= new HashMap<>();

        for(int n: nums){
            map.put(n,map.getOrDefault(n,0)+1);

        }
          for (int n:map.keySet()) {
            if (map.get(n) == 2) {
                list.add(n);
            }
        }
    
        return list;
    }
}