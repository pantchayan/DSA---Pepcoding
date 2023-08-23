import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int ans = power(x, n);
        System.out.println(ans);
        sc.close();
    }

    public static int power(int x, int n) {
        if (n == 1) {
            return x;
        }
        return power(x, n - 1) * x;
    }

}