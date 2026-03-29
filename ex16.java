import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o valor para a posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Valores do vetor:");
        for (int i = 0; i < 5; i++) {
            System.out.println(vetor[i]);
        }

        sc.close();
    }
}
