import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        int primeiro = numeros[0];

        for (int i = 0; i < 10; i++) {
            if (numeros[i] == primeiro) {
                contador++;
            }
        }

        System.out.println("Quantidade de números iguais ao primeiro (" + primeiro + "): " + contador);

        sc.close();
    }
}