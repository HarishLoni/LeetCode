class Solution {
    public String reverseWords(String s) {
        String result="";
        int i=0;
        int n=s.length();
        
        while(i < n){
            while(i<n && s.charAt(i)==' '){
                i++;
            }
            int j=i;
            
            while(j<n && s.charAt(j)!=' '){
                j++;
            }
            
            if(i < j){
            String sub=s.substring(i,j);
            if(result.length()==0){
                result=sub;
            }
            else{
                result=sub+" "+result;
            }
            }
            i=j+1;
        }
        return result;
    }
}