class Solution {
    public boolean canArrange(int[] arr, int k) {
    
    HashMap<Integer,Integer> map= new HashMap<>();
    for(int n: arr){
       int rem= (n%k + k)%k;
       int need= (k-rem)%k;

    if(map.getOrDefault(need,0)>0)map.put(need,map.get(need)-1);
    else map.put(rem,map.getOrDefault(rem,0)+1);
    }
    for(int c: map.values()){
        if(c!=0)return false;
    }
    return true;

    }
}