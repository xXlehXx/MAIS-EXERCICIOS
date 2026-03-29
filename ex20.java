import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();

        int resultado = calcularDobro(n);

        System.out.println("O dobro é: " + resultado);

        sc.close();
    }

    public static int calcularDobro(int numero) {
        return numero * 2;
    }
}

