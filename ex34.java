import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] soma = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número do primeiro vetor: ");
            vetor1[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número do segundo vetor: ");
            vetor2[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            soma[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("Vetor resultante da soma:");
        for (int i = 0; i < 10; i++) {
            System.out.println(soma[i]);
        }

        sc.close();
    }
}