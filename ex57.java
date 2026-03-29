import java.util.Scanner;

public class ex57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Vetor[" + i + "]: ");
            vetor[i] = sc.nextInt();
        }

        if (n < 2) {
            System.out.println("Não há elementos suficientes para calcular diferenças.");
        } else {
            int[] diferencas = new int[n - 1];

            for (int i = 0; i < n - 1; i++) {
                diferencas[i] = vetor[i + 1] - vetor[i];
            }

            System.out.println("Diferenças consecutivas:");
            for (int i = 0; i < n - 1; i++) {
                System.out.print(diferencas[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}