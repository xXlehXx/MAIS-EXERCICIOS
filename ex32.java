import java.util.Scanner;

public class ex32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

        
        int maior = Integer.MIN_VALUE;
        int segundoMaior = Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            if (numeros[i] > maior) {
                
                segundoMaior = maior;
                maior = numeros[i];
            } else if (numeros[i] > segundoMaior && numeros[i] != maior) {
                
                segundoMaior = numeros[i];
            }
        }

        if (segundoMaior == Integer.MIN_VALUE) {
            System.out.println("Não foi possível encontrar um segundo maior (todos os números podem ser iguais).");
        } else {
            System.out.println("O maior valor é: " + maior);
            System.out.println("O segundo maior valor é: " + segundoMaior);
        }

        sc.close();
    }
}