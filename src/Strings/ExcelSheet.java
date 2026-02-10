package Strings;

public class ExcelSheet {
    public static void main(String[] args){
        ExcelSheet es = new ExcelSheet();

        System.out.println(es.convertToTitle(50));
    }

    public String convertToTitle(int columnNumber){
        StringBuilder sb = new StringBuilder();

        while(columnNumber > 0){
            columnNumber--;
            int result = columnNumber % 26;
            char ch = (char)('A' + result);
            sb.append(ch);
            columnNumber /= 26;
        }

        return sb.reverse().toString();
    }

}
