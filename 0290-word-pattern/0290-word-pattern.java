class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        String[] str=s.split(" ");
        if(pattern.length() != str.length){
            return false;
        }
        HashMap<Character,String> map=new HashMap<>();
        
        for(int i=0;i<pattern.length();i++){
            char ch1=pattern.charAt(i);
            String ch2=str[i];
            if(!map.containsKey(ch1)){
                if(!map.containsValue(ch2)){
                    map.put(ch1,ch2);
                }
                else{
                    return false;
                }
            }
            else{
                String ch3=map.get(ch1);
                if(!ch2.equals(ch3)){
                    return false;
                }
            }
        }
        return true;
    }
}