import java.util.Scanner;

public class ex55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de linhas: ");
        int linhas = sc.nextInt();
        System.out.print("Digite o número de colunas: ");
        int colunas = sc.nextInt();

        int[][] original = new int[linhas][colunas];
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Valor para [" + i + "][" + j + "]: ");
                original[i][j] = sc.nextInt();
            }
        }
        int[][] transposta = new int[colunas][linhas];

       
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = original[i][j];
            }
        }
        System.out.println("\nMatriz Transposta:");
        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                System.out.print(transposta[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
