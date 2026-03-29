import java.util.Scanner;

public class ex42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] original = new int[10];
        int[] pares = new int[10];
        int[] impares = new int[10];
        int contP = 0;
        int contI = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            original[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if (original[i] % 2 == 0) {
                pares[contP] = original[i];
                contP++;
            } else {
                impares[contI] = original[i];
                contI++;
            }
        }

        System.out.println("Vetor de Pares:");
        for (int i = 0; i < contP; i++) {
            System.out.println(pares[i]);
        }

        System.out.println("Vetor de Ímpares:");
        for (int i = 0; i < contI; i++) {
            System.out.println(impares[i]);
        }

        sc.close();
    }
}