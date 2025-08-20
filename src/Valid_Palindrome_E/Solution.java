package Valid_Palindrome_E;

//125. Valid Palindrome

public class Solution {

    public static void main(String[] args){

        Solution solution = new Solution();

        String value = "A man, a plan, a canal: Panama";

        solution.isPalindrome(value);

    }

    public boolean isPalindrome(String s) {

        String value  = s.replaceAll("[^A-Za-z0-9]","");
        value = value.toLowerCase();
        char[] chars = value.toCharArray();

        int pointerOne = 0;
        int pointerTwo = chars.length-1;

        while(pointerOne < pointerTwo){
            if(chars[pointerOne] != chars[pointerTwo]){
                return false;
            }else{
                pointerOne++;
                pointerTwo--;
            }
        }
        return true;
    }
}


//s =
//        "A man, a plan, a canal: Panama"
//Output
//true
//Expected
//true