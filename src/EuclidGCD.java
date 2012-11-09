/**
 * Reads two command-line arguments p and q and computes the greatest common divisor of p and q using Euclid's GCD algorithm.
 * With function call trace
 * See: http://introcs.cs.princeton.edu/java/23recursion/
 */
public class EuclidGCD {

    /**
     * Greatest common divisor via Euclid's GCD method
     * @param p
     * @param q
     * @return gcd
     */
    public static int gcd(int p, int q) {
        return gcd(p, q, p, q, 0);
    }

    /**
     * Greatest common divisor via Euclid's GCD method, with function call tracing
     * @param p
     * @param q
     * @return gcd
     */
    public static int gcd(int p, int q, int lastp, int lastq, int depth) {
        if (q == 0) {
            System.out.println(VisualizeHelper.indent(depth + 1) + "gcd(" + p + "," + q + ")");
            System.out.println(VisualizeHelper.indent(depth + 1) + "return " + p);
            return p;
        } else {
            depth++;
            System.out.println(VisualizeHelper.indent(depth) + "gcd(" + p + "," + q + ")");
            int last = gcd(q, p % q, p, q, depth);
            System.out.println(VisualizeHelper.indent(depth) + "return " + last);
            return last;
        }
    }

    public static void main(String[] args) {
//        int p = Integer.parseInt(args[0]);
//        int q = Integer.parseInt(args[1]);
        int p = 1440;
        int q = 408;
        int d  = gcd(p, q);
        System.out.println("gcd(" + p + ", " + q + ") = " + d);
    }

}