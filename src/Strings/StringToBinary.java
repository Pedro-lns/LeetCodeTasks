package Strings;

/**
 * Pedro Lucas
 * pedro.lns.dev@gmail.com
 * 06/02/2026
 **/


//Given two binary strings a and b, return their sum as a binary string.

import java.util.Scanner;

public class StringToBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digit D1: ");
        String d1 = sc.nextLine();

        System.out.println("Digit D2: ");
        String d2 = sc.nextLine();

        System.out.printf("Soma: %s + %s = %s\n", d1,d2,addBinary(d1,d2));
    }

    public static String addBinary(String d1, String d2){
        int i = d1.length()-1;
        int j = d2.length()-1;
        int carry = 0;

        StringBuilder sb = new StringBuilder();

        while(i >= 0 || j >= 0){
            int soma = carry;

            if(i >= 0){
                soma += d1.charAt(i) - '0';
                i--;
            }

            if(j >= 0){
                soma += d2.charAt(j) - '0';
                j--;
            }

            sb.append(soma % 2);
            carry = soma / 2;
        }

        if(carry == 1) sb.append(1);

        return sb.reverse().toString();
    }
}
