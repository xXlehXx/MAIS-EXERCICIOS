import java.util.Scanner;

public class ex64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = sc.nextInt();

        int mediaInteira = (a + b) / 2;

        System.out.println(mediaInteira);

        sc.close();
    }
}
