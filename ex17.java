import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        double[] vetor = new double[tamanho];
        double soma = 0;

        for (int i = 0; i < tamanho; i++) {
            System.out.println("Digite o valor para a posição " + i + ": ");
            vetor[i] = sc.nextDouble();
            soma = soma + vetor[i];
        }

        double media = soma / tamanho;

        System.out.println("Média: " + media);

        sc.close();
    }
}