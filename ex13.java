import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite o segundo número: ");
        double n2 = sc.nextDouble();

        System.out.println("Soma: " + (n1 + n2));
        System.out.println("Subtração: " + (n1 - n2));
        System.out.println("Multiplicação: " + (n1 * n2));

        if (n2 != 0) {
            System.out.println("Divisão: " + (n1 / n2));
        } else {
            System.out.println("Divisão: Não é possível dividir por zero");
        }

        sc.close();
    }
}
