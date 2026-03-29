import java.util.Scanner;

public class ex66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho da sequência: ");
        int n = sc.nextInt();
        int[] sequencia = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Valor na posição " + i + " (0 ou 1): ");
            sequencia[i] = sc.nextInt();
        }

        int contadorPadroes = 0;

        for (int i = 0; i < n - 2; i++) {
            if (sequencia[i] == 1 && sequencia[i + 1] == 0 && sequencia[i + 2] == 0) {
                contadorPadroes++;
            }
        }

        System.out.println(contadorPadroes);

        sc.close();
    }
}
