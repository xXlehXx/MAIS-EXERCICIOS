import java.util.Scanner;

public class ex60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int linhas = sc.nextInt();
        System.out.print("Digite o número de colunas: ");
        int colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMenor valor de cada linha:");
        for (int i = 0; i < linhas; i++) {
            int menorDaLinha = matriz[i][0];
            for (int j = 1; j < colunas; j++) {
                if (matriz[i][j] < menorDaLinha) {
                    menorDaLinha = matriz[i][j];
                }
            }
            System.out.println("Linha " + i + ": " + menorDaLinha);
        }

        sc.close();
    }
}
