import java.util.Scanner;

public class ex47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }

        if (n > 0) {
            int ultimo = vetor[n - 1];

            for (int i = n - 1; i > 0; i--) {
                vetor[i] = vetor[i - 1];
            }

            vetor[0] = ultimo;
        }

        System.out.println("Vetor rotacionado para a direita:");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}