import java.util.Scanner;

public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int contador = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (numeros[i] > 100) {
                contador++;
            }
        }

        System.out.println("Quantidade de números maiores que 100: " + contador);

        sc.close();
    }
}