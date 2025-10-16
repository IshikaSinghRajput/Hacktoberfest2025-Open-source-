class Solution {
    public boolean isPalindrome(String s) {
        if(s == null || s.isEmpty()) return true;

        int left = 0;
        int right = s.length() - 1;

        while(left < right){
            // skip non-alphanumeric on left
            while(left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            // skip non-alphanumeric on right
            while(left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            char c = Character.toLowerCase(s.charAt(left));
            if(c != Character.toLowerCase(s.charAt(right))) return false;

            left++;
            right--;
        }
        return true;
    }
}
