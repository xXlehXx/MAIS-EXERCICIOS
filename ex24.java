import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o valor para a posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            int temp = vetor[i];
            vetor[i] = vetor[n - 1 - i];
            vetor[n - 1 - i] = temp;
        }

        System.out.println("Vetor invertido:");
        for (int i = 0; i < n; i++) {
            System.out.println(vetor[i]);
        }

        sc.close();
    }
}