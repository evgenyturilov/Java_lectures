public class first_steps {                      // автоматически заполняется при наборе class
    public static void main(String[] args) {    // автоматически заполняется при наборе main
        
// Типы данных: 
//          примитивные:    boolean, int, short, long, float, double, Char
//          ссылочные:      массивы и др.

// Создание переменной:
//                          <тип><идентификатор>;
//                          <идентификатор> = <значение>;
        String s = null;
        System.out.println(s);

        short age = 10;                         // целые числа short и int
        int salary = 123456;
        System.out.println(age);
        System.out.println(salary);

        float e  = 2.7f;                        // вещественные цисла float и double
        double pi = 3.1415;
        System.out.println(e);
        System.out.println(pi);

        char ch = '1';
        System.out.println(Character.isDigit(ch));
        ch = 'a';
        System.out.println(Character.isDigit(ch));

        boolean flag1 = 123 <= 234;
        System.out.println(flag1);
        boolean flag2 = 123 >= 234;
        System.out.println(flag2);
        boolean flag3 = flag1 ^ flag2;
        System.out.println(flag3);

        // Логические операции && - AND; || - OR; ^ - исключающее ИЛИ; ! НЕ
        //
        // |   A   |   B   |   A|B   |   A&B   |   A^B   |   !A    |
        // | false | false |  false  |  false  |  false  |  true   |
        // | true  | false |  true   |  false  |  true   |  false  |
        // | false | true  |  true   |  false  |  true   |  true   |
        // | true  | true  |  true   |  true   |  false  |  false  |

        String msg = "Hello World!";
        System.out.println(msg);
    }
}




//
//              
//


