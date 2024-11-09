class Solution {
    public List<List<String>> partition(String s) {
         List<List<String>> res=new ArrayList<>();
        List<String> temp=new ArrayList<>();
        
        solve(s,res,temp,0);
        
        return res;
    }
    
    public static void solve(String s,List<List<String>> res,List<String> temp,int ind){
        if(ind==s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=ind;i<s.length();i++){
             if(ispalindrome(s,ind,i)){
                 temp.add(s.substring(ind,i+1));
                 solve(s,res,temp,i+1);
                 temp.remove(temp.size()-1);
             }
        }
       
    }
    
    public static boolean ispalindrome(String s,int start,int end){
        while(start<=end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}