package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args){
        String s = "anagram";
        String t = "gramana";

        System.out.println(isAnagram(s,t));
    }

    /*
    public static boolean isAnagram(String s, String t){
        String limpaS1 = s.replaceAll("\\s", "").toLowerCase();
        String limpaS2 = s.replaceAll("\\s", "").toLowerCase();

        if (limpaS1.length() != limpaS2.length()) {
            return false;
        }

        // Converter strings para arrays de caracteres e ordenar
        char[] s_array = limpaS1.toCharArray();
        char[] t_array = limpaS2.toCharArray();

        //Ordenar os arrays.
        Arrays.sort(s_array);
        Arrays.sort(t_array);

        // Comparar os arrays ordenados.
        return Arrays.equals(s_array, t_array);
    }
     */

    public static boolean isAnagram(String s, String t){
        String limpaS1 = s.replaceAll("\\s", "").toLowerCase();
        String limpaS2 = s.replaceAll("\\s", "").toLowerCase();

        if(s.length() != t.length()) return false;

        int[] array = new int[26];

        for(int i = 0 ; i < s.length() ; i++){
            array[s.charAt(i) - 'a']++;
            array[t.charAt(i) - 'a']--;
        }

        for(int i : array){
            if(i != 0)
                return false;
        }

        return true;
    }
}
