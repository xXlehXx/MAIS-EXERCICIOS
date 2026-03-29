import java.util.Scanner;

public class ex50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho dos vetores: ");
        int n = sc.nextInt();

        int[] vetor1 = new int[n];
        int[] vetor2 = new int[n];
        boolean saoIguais = true;

        for (int i = 0; i < n; i++) {
            System.out.print("Vetor 1, posição " + i + ": ");
            vetor1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Vetor 2, posição " + i + ": ");
            vetor2[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vetor1[i] != vetor2[i]) {
                saoIguais = false;
                break;
            }
        }

        if (saoIguais) {
            System.out.println("Os vetores são iguais.");
        } else {
            System.out.println("Os vetores são diferentes.");
        }

        sc.close();
    }
}
