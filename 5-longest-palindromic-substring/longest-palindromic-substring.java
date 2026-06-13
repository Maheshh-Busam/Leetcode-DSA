class Solution {
    public String longestPalindrome(String s) {
        int length = 0;
        String longestPalindrome = "";
        int n = s.length();

        for(int i = 0; i < n; i++){
            int left = i, right = i;

            while(left >= 0 && right < n){
                if(s.charAt(left) == s.charAt(right)){
                    String currString = s.substring(left, right + 1);
                    if(currString.length() > length){
                        length = currString.length();
                        longestPalindrome = currString;
                    }
                }
                else {
                    break;
                }
                left--;
                right++;
            }
        }
        for(int i = 0; i < n; i++){
            int left = i, right = i + 1;
            
            while(left >= 0 && right < n){
                if(s.charAt(left) == s.charAt(right)){
                    String currString = s.substring(left, right + 1);
                    if(currString.length() > length){
                        length = currString.length();
                        longestPalindrome = currString;
                    }
                }
                else {
                    break;
                }
                left--;
                right++;
            }
        }
        return longestPalindrome;
    }
}