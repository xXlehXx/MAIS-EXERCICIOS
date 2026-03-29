import java.util.Scanner;

public class ex39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                numeros[i] = -1;
            }
        }

        System.out.println("Vetor resultante:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}
