package Palindrome_Number;

//9 - Palindrome Number

class Solution {
    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        String result = "";
        for (int i = str.length()-1; i>=0; i--){
            result += str.charAt(i);
            if (result.equals(str)){
                return true;
            }
        }
        return false;
    }
}

//x =
//        121
//Output
//true
//Expected
//true