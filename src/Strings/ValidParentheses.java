package Strings;

public class ValidParentheses {
    public static void main(String[] args){
        String s1 = "()[]{}";
        String s2 = "({)}[()]";

        System.out.println(isValid(s1));
        System.out.println(isValid(s2));
    }

    public static boolean isValid(String s){
        char[] stack = new char[s.length()];
        int top = -1;

        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' ||  ch == '['){
                stack[++top] = ch;
            }
            else{
                if(top == -1) return false;

                char openning = stack[top--];

                if(ch == '(' && openning != ')' ||
                   ch == ']' && openning != '[' ||
                   ch == '}' && openning != '{')
                    return false;
            }
        }

        return (top == -1);
    }
}
