import java.util.Scanner;

public class ex53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Vetor[" + i + "]: ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Digite o valor que deseja remover: ");
        int alvo = sc.nextInt();

        // Primeiro, contamos quantos elementos NÃO são o valor alvo
        int novoTamanho = 0;
        for (int i = 0; i < n; i++) {
            if (vetor[i] != alvo) {
                novoTamanho++;
            }
        }

        // Criamos um novo vetor com o tamanho reduzido
        int[] vetorResultante = new int[novoTamanho];
        int j = 0;

        // Preenchemos o novo vetor apenas com os elementos que devem ficar
        for (int i = 0; i < n; i++) {
            if (vetor[i] != alvo) {
                vetorResultante[j] = vetor[i];
                j++;
            }
        }

        System.out.println("Vetor após a remoção:");
        if (novoTamanho == 0) {
            System.out.println("O vetor está vazio.");
        } else {
            for (int i = 0; i < novoTamanho; i++) {
                System.out.print(vetorResultante[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}