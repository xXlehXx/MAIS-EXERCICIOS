import java.util.Scanner;

public class ex48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor para a posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }

        boolean ehPalindromo = true;

        for (int i = 0; i < n / 2; i++) {
            if (vetor[i] != vetor[n - 1 - i]) {
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println("O vetor é um palíndromo.");
        } else {
            System.out.println("O vetor NÃO é um palíndromo.");
        }

        sc.close();
    }
}