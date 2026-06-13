class Solution {
    public String longestPalindrome(String s) {
        
        int length = 0;
        String longestPalindrome = "";

        for(int i = 0; i < s.length(); i ++){
            for(int j = i; j < s.length(); j++){
                String currString = s.substring(i, j + 1);
                if(isPalindrome(currString)){
                    if(currString.length() > length){
                        length = currString.length();
                        longestPalindrome = currString;
                    }
                }
            }
        }
        return longestPalindrome;

    }

    public boolean isPalindrome(String s){
        int start = 0, end = s.length() - 1;

        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}