class Solution {
    public boolean isPalindrome(String s) {
        int i=0,j=s.length()-1;
        if(s.length()<=1) return true;
        // Iterate till both low and high pointer cross each other
        while(i<j){
             // skip current or subsequent non-alphanumeric characters from front.
            while(i<j && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            // skip current or subsequent non-alphanumeric characters from back.
            while(i<j && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            // validate chars by ignoring case sensitivity.
            if(i<j && Character.toLowerCase(s.charAt(i))!=Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
                  
        }
        return true;
    }
}
