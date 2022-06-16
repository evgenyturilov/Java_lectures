public class ambigous_types {
    public static void main(String[] args) {
        var a  = 123;
        System.out.println(a);
        var d = 123.456;
        System.out.println(d);
        System.out.println(getType(a));
        System.out.println(getType(d));
    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}
