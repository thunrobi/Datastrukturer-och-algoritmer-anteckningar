public class Recursy {

    static long ops;

    static void hello() {
        hello();
    }

    /**
     * Recursive loop
     *
     * @param i
     * @param max
     */
    static void loop(int i, int max) {
        if (i > max) return;
        System.out.print(i + " ");
        loop(i + 1, max);

    }

    /**
     * fibonacci
     */
    static int fib(int n) {
        ops++;
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);

    }

    static int[] fibCache = new int[1000];

    static int fastFib(int n) {
        ops++;
        if (n <= 1) return n;
        if (fibCache[n] != 0) return fibCache[n];
        int ret = fastFib(n - 1) + fastFib(n - 2);
        fibCache[n] = ret;
        return ret;
    }

    static void countdown(int i) {
        if (i <= 0) return;
        System.out.print(i + " ");
        countdown(i - 1);
    }

     static int pow(int base, int power) {
        if (power != 0)  return (base * pow(base, power - 1));
        else return 1;
    }
}
