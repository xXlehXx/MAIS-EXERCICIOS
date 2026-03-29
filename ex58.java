import java.util.Scanner;

public class ex58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("O vetor precisa de pelo menos 2 elementos.");
        } else {
            int[] vetor = new int[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Vetor[" + i + "]: ");
                vetor[i] = sc.nextInt();
            }

            int resultado = encontrarSegundoMaior(vetor);
            System.out.println("O segundo maior valor é: " + resultado);
        }

        sc.close();
    }

    public static int encontrarSegundoMaior(int[] v) {
        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int i = 0; i < v.length; i++) {
            if (v[i] > maior) {
                segundoMaior = maior;
                maior = v[i];
            } else if (v[i] > segundoMaior && v[i] != maior) {
                segundoMaior = v[i];
            }
        }

        return segundoMaior;
    }
}
