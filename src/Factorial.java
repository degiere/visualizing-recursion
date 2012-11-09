/**
 * Factorial: n! = n * (n-1) * (n-2) * ... * 2 * 1
 * With function call trace
 * See: http://introcs.cs.princeton.edu/java/23recursion/
 */
public class Factorial {

    /**
     * factorial: n!
     * @param n
     * @return n!
     */
    public static long factorial(int n) {
        if (n > 20) throw new IllegalArgumentException("n > 20 overflows!");
        if (n == 1) return 1;
        return n * factorial(n-1);
    }

    /**
     * factorial with function call trace: n!
     * @param n
     * @return n!
     */
    public static long factorial(int n, boolean trace) {
        return factorial(n, n, trace);
    }

    private static long factorial(int n, int init, boolean trace) {
        if (n > 20) throw new IllegalArgumentException("n > 20 overflows!");
        if (trace) System.out.println(VisualizeHelper.indent(init - n) + "factorial(" + n + ")");
        if (n == 1) {
            if (trace) System.out.println(VisualizeHelper.indent(init) + "return 1");
            return 1;
        } else {
            long last = factorial(n - 1, init, trace);
            long f = n * last;
            if (trace) System.out.println(VisualizeHelper.indent(init - n) + "return " + n + "*" + last + " = " + f);
            return f;
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5, true));
//        System.out.println(factorial(5));
    }

}