package Recursion;

public class Test {
    public static void main(String[] args) {
        System.out.println(fac(4));
        //4! = 4 * 3 * 2 * 1
        //1! = 1
        //0! = 1

        // counter(3) -> counter(2) -> counter(1) -> counter(0)

    }

    // fac(4)
    // 4 * fac(3)  4 * 6 = 24
    // 3 * fac(2)  3 * 2 = 6
    // 2 * fac(1)  2 * 1
    // fac(1) = return 1;

    private static int fac(int n) {
        if (n==1)
            return 1;
        return n * fac(n-1);
    }
}
