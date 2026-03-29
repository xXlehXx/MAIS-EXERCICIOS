import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Vetor em ordem crescente:");
        for (int i = 0; i < 10; i++) {
            System.out.println(numeros[i]);
        }

        sc.close();
    }
}