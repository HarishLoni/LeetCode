class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<(haystack.length()-needle.length())+1;i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                if(haystack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}

// class Solution {
//     public int strStr(String haystack, String needle) {
//         int haystackLength = haystack.length();
//         int needleLength = needle.length();
        
//         for (int i = 0; i <= haystackLength - needleLength; i++) {
//             boolean found = true;
//             for (int j = 0; j < needleLength; j++) {
//                 if (haystack.charAt(i + j) != needle.charAt(j)) {
//                     found = false;
//                     break;
//                 }
//             }
//             if (found) {
//                 return i;
//             }
//         }
        
//         return -1;
//     }
// }
