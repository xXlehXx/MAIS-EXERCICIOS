import java.util.Scanner;

public class ex46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        System.out.print("Digite o valor de X (soma desejada): ");
        int x = sc.nextInt();

        System.out.println("Pares que somam " + x + ":");
        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (numeros[i] + numeros[j] == x) {
                    System.out.println(numeros[i] + " + " + numeros[j] + " = " + x);
                }
            }
        }

        sc.close();
    }
}
