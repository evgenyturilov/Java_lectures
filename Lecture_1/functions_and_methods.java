public class functions_and_methods {
    public static void main(String[] args) {
        sayHi();
        lib.sayHi();
        int s = sum(3,5);
        double d = factor(7);
        System.out.printf("%d \n%.3f", s, d);

    }

    static void sayHi() {
        System.out.println("hi");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double factor(int n) {
        if (n == 1)
            return 1;
        return n + factor(n - 1);
    }
}
