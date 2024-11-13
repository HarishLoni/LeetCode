class Solution {
    public int firstUniqChar(String s) {
        
        int ind=-1;
        int n=s.length();
        if(s.length()==1){
            return 0;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                ind=i;
                if(s.charAt(i)==s.charAt(j)){
                    ind=-1;
                    break;
                }
              }
            }
            if(ind>=0){
                return ind;
            }
        }
        return -1;
    }
}