package Strings;

/**
 * Pedro Lucas
 * pedro.lns.dev@gmail.com
 * 06/02/2026
 */

public class LongPrefix {
    public static void main(String[] args){
        String[] s = {"hello", "here", "hell"};

        System.out.println(longestCommonPrefix(s));//result: he
    }

    public static String longestCommonPrefix(String[] s){
        /*
            optional
            if(s == NULL || s.length == 0) return "":
         */

        String result = s[0];

        for(int i = 1; i < s.length ; i++){
            while(!s[i].startsWith(result)){
                result = result.substring(0,result.length()-1);
            }

            if(result.isEmpty()){
                return "";
            }
        }

        return result;
    }
}
