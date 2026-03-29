import java.util.Scanner;

public class ex43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a ordem da matriz quadrada: ");
        int n = sc.nextInt();
        int[][] matriz = new int[n][n];
        boolean ehSimetrica = true;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Digite o valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] != matriz[j][i]) {
                    ehSimetrica = false;
                    break;
                }
            }
            if (!ehSimetrica) break;
        }

        if (ehSimetrica) {
            System.out.println("A matriz é simétrica.");
        } else {
            System.out.println("A matriz NÃO é simétrica.");
        }

        sc.close();
    }
}
