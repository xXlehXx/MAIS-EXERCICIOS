import java.util.Scanner;

public class ex40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        int contador = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Digite o valor que deseja contar: ");
        int valorProcurado = sc.nextInt();

        for (int i = 0; i < 10; i++) {
            if (numeros[i] == valorProcurado) {
                contador++;
            }
        }

        System.out.println("O valor " + valorProcurado + " aparece " + contador + " vezes.");

        sc.close();
    }
}