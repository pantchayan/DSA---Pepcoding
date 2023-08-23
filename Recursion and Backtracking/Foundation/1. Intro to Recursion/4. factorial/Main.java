import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
        sc.close();
    }

    public static int factorial(int n) {
        // f(n) = 1 * 2 * 3 * 4 ... * n
        // f(n) = f(n-1) * n
        if (n == 1)
            return 1;

        return factorial(n - 1) * n;
    }

}