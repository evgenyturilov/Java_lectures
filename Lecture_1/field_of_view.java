public class field_of_view {
    public static void main(String[] args) {
    /*  int a = 123;                    Данную переменную можно использовать в коде внутри скобок

        {
            int a = 222;                В таком виде выдаст ошибку о том, что переменная "а" уже назначена, но
            System.out.println(a);
        }
    */

    {
        int a = 123;                    // В таком случае ошибки не будет, действие будет выполняться только в скобках (ОБЛАСТЬ ВИДИМОСТИ)
    }

    int a = 222;
    System.out.println(a);
                                        // Переменную можно будет определять и на уровне класса, тогда она будет видна везде
                                        // static int t = 12345; но вызвать ее можно будет только через имя класса
    }
}
