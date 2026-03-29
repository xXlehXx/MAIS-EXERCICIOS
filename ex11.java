import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        System.out.println("Digite 10 números: ");

        for (int i = 0; i < 10; i++) {
            System.out.println("Número " + (1+i) + ": ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i]);
            }
        }
        sc.close();
    }
}