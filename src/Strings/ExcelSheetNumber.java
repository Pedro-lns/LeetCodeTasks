package Strings;

public class ExcelSheetNumber {
    public static void main(String[] args){
        ExcelSheetNumber es = new ExcelSheetNumber();

        System.out.println(es.titleToNumber("ACAC"));
    }

    public  int titleToNumber(String columnTitle){
        if(columnTitle.isBlank()) return 0;

        int result = 0;
        for(int i = 0 ; i < columnTitle.length() ; i++){
            result = (result * 26) + columnTitle.charAt(i)+1 - 'A';
        }

        return result;
    }
}
