package Strings;

public class Palidrome {
    public static void main(String[] args){
        Palidrome pl = new Palidrome();

        String s = "A man, a plan, a canal: Panama";
        s = s.replaceAll("[,.:; ]", "").toLowerCase();

        StringBuilder sb = new StringBuilder(s);

        sb.reverse();
        String reversed = sb.toString();

        if(pl.isPalidrome(s))
            System.out.println(reversed + " is a palidrome!");
        else
            System.out.println(reversed + " is not a palidrome!");
    }

    public boolean isPalidrome(String s){
        int esq = 0;
        int dir = s.length()-1;

        while(esq < dir){
            if(s.charAt(esq) != s.charAt(dir)) return false;

            esq++;
            dir--;
        }

        return true;
    }
}
