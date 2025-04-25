package easy;

public class Problem509_FibonacciNumber {

//    public static int fib(int n) {
//
//        if (n == 0) {
//            return 0;
//        }
//        if (n == 1) {
//            return 1;
//        }
//        if (n > 1) {
//            int value=0;
//            value = fib(n - 1) + fib(n - 2);
//            return value;
//        }
//        return -1;
//    }

    public static int fib(int n) {

        if (n < 2) {
            return n;
        }
        int value = 0;
        value = fib(n - 1) + fib(n - 2);
        return value;
    }

    public static void main(String[] args) {

        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
    }
}
