class RandomizedSet {
      private List<Integer> values;
    private Map<Integer, Integer> valIdx;
    public RandomizedSet() {
         this.values = new ArrayList<>();
        this.valIdx = new HashMap<>();
    }
    
    public boolean insert(int val) {
         if (valIdx.containsKey(val)) {
            return false;
        }
        valIdx.put(val, values.size());
        values.add(val);

        return true;
    }
    
    public boolean remove(int val) {
        if (!valIdx.containsKey(val)) {
            return false;
        }
        int index = valIdx.get(val);
        valIdx.put(values.get(values.size() - 1), index);
        valIdx.remove(val);
        values.set(index, values.get(values.size() - 1));
        values.remove(values.size() - 1);

        return true;
    }
    
    public int getRandom() {
          int index = (int) (Math.random()*values.size());
        return values.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */