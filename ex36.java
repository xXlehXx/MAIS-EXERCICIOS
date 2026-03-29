import java.util.Scanner;

public class ex36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }

        int novoTamanho = n;

        for (int i = 0; i < novoTamanho; i++) {
            for (int j = i + 1; j < novoTamanho; j++) {
                if (vetor[i] == vetor[j]) {
                    for (int k = j; k < novoTamanho - 1; k++) {
                        vetor[k] = vetor[k + 1];
                    }
                    novoTamanho--;
                    j--;
                }
            }
        }

        System.out.println("Vetor sem duplicados:");
        for (int i = 0; i < novoTamanho; i++) {
            System.out.println(vetor[i]);
        }

        sc.close();
    }
}
