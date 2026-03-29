import java.util.Scanner;

public class ex59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Vetor[" + i + "]: ");
            vetor[i] = sc.nextInt();
        }

        ordenarVetor(vetor);

        System.out.println("Vetor ordenado (Bubble Sort):");
        for (int i = 0; i < n; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        sc.close();
    }

    public static void ordenarVetor(int[] v) {
        int n = v.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (v[j] > v[j + 1]) {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                }
            }
        }
    }
}