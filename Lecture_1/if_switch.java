import java.util.Scanner;

public class if_switch {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        if (a > b) { // if (a > b) c = a;
            c = a;
        } else { // if (b > a) c = b;
            c = b;
        }
        System.out.println(c);

        // Тернарный оператор int min = a > b ? a : b - если выполняется условие, то
        // переменной присваивается значение до двоеточия, в противном случае
        // присваивается значение после двоеточия.
        // Примечание. При использовании тернарного оператора будет возвращаться
        // значение, т.е. использовать sysout не получится.

        int l = 5;
        int m = 7;
        int min = l > m ? l : m;

        System.out.println(min);

    /*  int month = value;
        String txt = "";
        switch (month) {
            case 1:
                txt = "January";
                break;
            default:
                txt = "mistake";
                break;

        }
        System.out.println(txt);
        String value = iScanner.close();
    */
    }
    
}
