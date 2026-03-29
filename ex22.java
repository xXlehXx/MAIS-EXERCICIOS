import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        int maior = numeros[0];
        int posicao = 0;

        for (int i = 1; i < 10; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posicao = i;
            }
        }

        System.out.println("O maior valor é " + maior + " e está na posição " + posicao);

        sc.close();
    }
}