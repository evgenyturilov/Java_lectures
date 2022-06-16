public class wrappers {
    public static void main(String[] args) {
        /*  | Примитив | Обертка |
            |   int    | Integer |
            |  short   |  Short  |
            |   long   |   Long  |
            |   byte   |   Byte  |
            |  float   |  Float  |
            |  double  |  Double |
            |   char   |Character|
            | boolean  | Boolean |
        */

        int i = 123;                            // У int и double можно разделять разряды нижним подчеркиванием int i = 12_234_000;
        System.out.println(Integer.MAX_VALUE);  // Здесь Integer - обертка, которая позволяет вызывать дополнительные опции,  
                                                // например максимальное и минимальное значение данного типа.

        String s = "qwerty";
        System.out.println(s.charAt(0));


    }
}
