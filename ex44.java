import java.util.Scanner;

public class ex44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz quadrada: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][n - 1 - i];
        }

        System.out.println("Soma da Diagonal Principal: " + somaPrincipal);
        System.out.println("Soma da Diagonal Secundária: " + somaSecundaria);
        System.out.println("Soma Total das Diagonais: " + (somaPrincipal + somaSecundaria));

        sc.close();
    }
}