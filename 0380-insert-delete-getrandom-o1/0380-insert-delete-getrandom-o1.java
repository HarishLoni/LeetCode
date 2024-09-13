class RandomizedSet {
    HashMap<Integer,Integer> map=new HashMap<>();
    ArrayList<Integer> arr=new ArrayList<>();
    Random random=new Random();

    public RandomizedSet() {
        
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        map.put(val,arr.size());
        arr.add(val);
        return true;
        
    }
    
    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int index=map.get(val);
        
        if(index != arr.size()-1){
            int tail= arr.get(arr.size()-1);
            int cur= arr.get(index);
            arr.set(index,tail);
            arr.remove(arr.size()-1);
            map.remove(cur);
            map.put(tail,index);
        }else{
            int tail= arr.remove(arr.size()-1);
            map.remove(tail);
        }
        return true;
        
    }
    
    public int getRandom() {
        int randomidx = random.nextInt(arr.size());
        return arr.get(randomidx);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */