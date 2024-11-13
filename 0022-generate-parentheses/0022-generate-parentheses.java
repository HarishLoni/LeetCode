class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();
        backtrack(list,"",n,0,0);
        return list;
    }
    public static void backtrack(List<String> list,String cur,int n,int open,int close){
        if(cur.length()==n*2){
            list.add(cur);
            return;
        }
        if(open<n){
            backtrack(list,cur+"(",n,open+1,close);
        }
        if(close<open){
            backtrack(list,cur+")",n,open,close+1);
        }
    }
}