import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int somaImpares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 != 0) {
                somaImpares += numeros[i];
            }
        }

        System.out.println("A soma dos números ímpares é: " + somaImpares);

        sc.close();
    }
}