class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res=new ArrayList<>();
        String temp="";
        
        if(digits.length()==0){
            return res;
        }
        
        HashMap<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        
        solve(digits,res,temp,map,0);
        
        return res;
    }
    
    public static void solve(String digits, List<String> res,String temp, HashMap<Character,String> map,int i){
        if(i==digits.length()){
            res.add(temp);
            return;
        }
        else{
            String pair=map.get(digits.charAt(i));
            for(int j=0;j<pair.length();j++){
                solve(digits,res,temp+pair.charAt(j),map,i+1);
            }
        }
    }
}