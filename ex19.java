import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (numeros[i] < 0) {
                numeros[i] = 0;
            }
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}