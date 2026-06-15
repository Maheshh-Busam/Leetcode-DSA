class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }

        int length = Integer.MAX_VALUE;

        for(String s : strs){
            length = Math.min(length, s.length());
        }

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < length; i++){
            char c = strs[0].charAt(i);

            for(int j = 1; j < strs.length; j++){
                char currChar = strs[j].charAt(i);
                if(c != currChar){
                    return result.toString();
                }
            }
            result.append(c);
        }
        return result.toString();
    }
}