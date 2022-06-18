public class ambigous_types {
    public static void main(String[] args) {
        var a  = 123;
        System.out.println(a);
        var g = 123.456;
        System.out.println(g);
        System.out.println(getType(a));
        System.out.println(getType(g));

        int i = 123; double k = i;              // Такая схема не работает с массивами:
                                                // int[] a = new int[10];
                                                // double[] d = a;
                                                // ИЗУЧАЕМ ковариантность и контрвариантность
        System.out.print(i);
        System.out.println((getType(i)));
        System.out.print(k);
        System.out.println(getType(k));

        double d = 3.1415; int j = (int)d;
        System.out.println(d);
        System.out.println(getType(d));
        System.out.println(j);
        System.out.println(getType(j));

        byte c = Byte.parseByte("123");
        System.out.println(c);
        byte b =Byte.parseByte("1234");
        System.out.println(b);
    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}
