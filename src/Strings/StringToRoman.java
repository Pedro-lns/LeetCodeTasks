package Strings;

/**
 * Pedro Lucas
 * pedro.lns.dev@gmail.com
 * 06/02/2026
 */

import java.util.Scanner;

public class StringToRoman {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número romano: ");
        String s = sc.nextLine();

        s = s.toUpperCase();

        System.out.println(romanToInt(s));
    }

    public static int romanValues(int ch){
        if(ch == 'I') return 1;
        else if(ch == 'V') return 5;
        else if(ch == 'X') return 10;
        else if(ch == 'L') return 50;
        else if(ch == 'C') return 100;
        else if(ch == 'D') return 500;
        else if(ch == 'M') return 1000;
        else return -1; //if s != roman algarism
    }

    public static int romanToInt(String s){
        int val = 0;

        for(int i = 0; i < s.length() ; i++){
            int currVal = romanValues(s.charAt(i));

            if(i+1 < s.length()){
                int newVal = romanValues(s.charAt(i+1));

                if(currVal >= newVal) {
                    val += currVal;
                }
                else{
                    val += newVal - currVal;
                    i++;
                }
            }else
                val += currVal;
        }

        return val;
    }
}
