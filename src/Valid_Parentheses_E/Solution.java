package Valid_Parentheses_E;

import java.util.HashMap;
import java.util.Stack;

public class Solution {

    public static void main(String[] args){

        Solution solution = new Solution();

        String s = "((()))";

        solution.isValid(s);

    }

    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            stack.push(s.charAt(i));
        }



        return false;

    }

}
