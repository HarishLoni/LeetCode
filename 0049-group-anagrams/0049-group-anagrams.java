class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0 || strs==null){
            return new ArrayList<>();
        }
        HashMap<String,List<String>> map=new HashMap<>();
        
        for(String s:strs){
            char[] arr=s.toCharArray();
            Arrays.sort(arr);
            String key=String.valueOf(arr);
            
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        
        // List<List<String>> result=new ArrayList<>();
        // for(Map.Entry<String,List<String>> s:map.entrySet()){
        //     result.add(s.getValue());
        // }
        // return result;
        
        return new ArrayList<>(map.values());
    }
}