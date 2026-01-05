package Longest_Palindromic_Substring_M;

public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();

        solution.longestPalindrome("cbbd");

    }

    public String longestPalindrome(String s) {

        String result = "";

        for (int i = 0; i < s.length(); i++) {

            int al = i;
            int ar = i;

            while (al >= 0 && ar < s.length() && s.charAt(al) == s.charAt(ar)) {
                String temp = s.substring(al, ar + 1);
                if (temp.length() > result.length()) {
                    result = temp;
                }
                al--;
                ar++;
            }

            al = i;
            ar = i + 1;

            while (al >= 0 && ar < s.length() && s.charAt(al) == s.charAt(ar)) {
                String temp = s.substring(al, ar + 1);
                if (temp.length() > result.length()) {
                    result = temp;
                }
                al--;
                ar++;
            }
        }

        return result;
    }

}
