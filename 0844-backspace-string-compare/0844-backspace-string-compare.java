class Solution {
    static String getactual(String str){
        StringBuilder s=new StringBuilder();
        int hashcount=0;
        
        for(int i=str.length()-1 ; i>=0 ;i--){
            if(str.charAt(i)=='#'){
                hashcount++;
                continue;
            }
            if(hashcount>0){
                hashcount--;
            }
            else{
                s.insert(0,str.charAt(i));
            }
        }
        return s.toString();
    }
    
    
    public boolean backspaceCompare(String s, String t) {
        return getactual(s).equals(getactual(t));
    }
}