import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        double soma = 0;
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
            soma += numeros[i];
        }

        double media = soma / 10;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] > media) {
                contador++;
            }
        }

        System.out.println("Média: " + media);
        System.out.println("Quantidade de números maiores que a média: " + contador);

        sc.close();
    }
}