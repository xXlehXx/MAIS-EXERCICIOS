import java.util.Scanner;

public class ex45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        int moda = numeros[0];
        int maxFrequencia = 0;

        for (int i = 0; i < 10; i++) {
            int contador = 0;
            for (int j = 0; j < 10; j++) {
                if (numeros[i] == numeros[j]) {
                    contador++;
                }
            }

            if (contador > maxFrequencia) {
                maxFrequencia = contador;
                moda = numeros[i];
            }
        }

        System.out.println("O valor mais frequente (moda) é: " + moda);
        System.out.println("Frequência: " + maxFrequencia + " vezes.");

        sc.close();
    }
}