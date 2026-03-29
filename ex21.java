import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        double somaPares = 0;
        int contadorPares = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                somaPares = somaPares + numeros[i];
                contadorPares++;
            }
        }

        if (contadorPares > 0) {
            double media = somaPares / contadorPares;
            System.out.println("Média dos números pares: " + media);
        } else {
            System.out.println("Nenhum número par foi digitado.");
        }

        sc.close();
    }
}
