// Longest Common Prefix
// Link - https://practice.geeksforgeeks.org/problems/longest-common-prefix-in-an-array5129/1


class Solution{
    String longestCommonPrefix(String arr[], int n){
       StringBuilder ans = new StringBuilder();
         for(int i = 0;i<arr[0].length();++i){
             char ch = arr[0].charAt(i);
             boolean match = true;

             for(int j = 1; j < n;++j){
                 if(i >= arr[j].length()|| ch != arr[j].charAt(i)){
                     match = false;
                     break;
                 }
             }
             if (!match)
                 break;
             else
                 ans.append(ch);
         }
         if(ans.length()>0)
            return ans.toString();
         else
             return "-1";
    }
}