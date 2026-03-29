import java.util.Scanner;

public class ex31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[10];
        boolean estaCrescente = true;

        for (int i = 0; i < 10; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }

       
        for (int i = 0; i < 9; i++) {
            if (numeros[i] > numeros[i + 1]) {
                estaCrescente = false;
                break; 
            }
        }

        if (estaCrescente) {
            System.out.println("O vetor está em ordem crescente.");
        } else {
            System.out.println("O vetor NÃO está em ordem crescente.");
        }

        sc.close();
    }
}
