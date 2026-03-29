import java.util.Scanner;

public class ex67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de N: ");
        int n = sc.nextInt();

        if (n == 0 || n == 1) {
            System.out.println(1);
        } else {
            long[] fib = new long[n + 1];
            fib[0] = 1;
            fib[1] = 1;

            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }

            System.out.println(fib[n]);
        }

        sc.close();
    }
}
