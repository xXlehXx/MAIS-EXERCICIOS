import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean temRepetido = false;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (numeros[i] == numeros[j]) {
                    temRepetido = true;
                }
            }
        }

        if (temRepetido) {
            System.out.println("Existem números repetidos no vetor.");
        } else {
            System.out.println("Não existem números repetidos no vetor.");
        }

        sc.close();
    }
}
