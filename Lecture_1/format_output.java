public class format_output {
    public static void main(String[] args) {
        int a = 1; int b =2;
        int c = a + b;
        String res = a + "+" + b + "=" + c;
        System.out.println(res);

        String res_2 = String.format("%d + %d = %d\n", a, b, c);
        System.out.println(res_2);

        System.out.printf("%d + %d = %d\n", a, b, c);

        // %d - для вывода целочисленных значений
        // %x - для вывода шестнадцатиричных чисел
        // %f - для вывода чисел с плавающей точкой
        // %e - для вывода чисел в экспоненциальной форме 3.1415е+01
        // %c - для вывода одиночного символа
        // %s - для вывода строковых значений
        //
        // Для вывода количества знаков после запятой используются
        // %.2f %.3e
    }
}
