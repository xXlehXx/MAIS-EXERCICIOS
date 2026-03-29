import java.util.Scanner;

public class ex51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int linhas = sc.nextInt();
        System.out.print("Digite o número de colunas: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];
        int contadorPositivos = 0;

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Valor [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] > 0) {
                    contadorPositivos++;
                }
            }
        }

        System.out.println("Quantidade de números positivos: " + contadorPositivos);

        sc.close();
    }
}