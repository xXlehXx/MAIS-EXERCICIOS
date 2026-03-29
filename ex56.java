import java.util.Scanner;

public class ex56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz quadrada: ");
        int n = sc.nextInt();

        int[][] matriz = new int[n][n];
        boolean ehIdentidade = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    if (matriz[i][j] != 1) {
                        ehIdentidade = false;
                        break;
                    }
                } else {
                    if (matriz[i][j] != 0) {
                        ehIdentidade = false;
                        break;
                    }
                }
            }
            if (!ehIdentidade) break;
        }

        if (ehIdentidade) {
            System.out.println("A matriz é identidade.");
        } else {
            System.out.println("A matriz NÃO é identidade.");
        }

        sc.close();
    }
}
