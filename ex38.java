import java.util.Scanner;

public class ex38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextDouble();
        }

        double media = calcularMedia(numeros);

        System.out.println("A média é: " + media);

        sc.close();
    }

    public static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        return soma / vetor.length;
    }
}
