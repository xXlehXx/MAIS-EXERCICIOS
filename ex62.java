import java.util.Scanner;

public class ex62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de dias letivos registrados: ");
        int totalDias = sc.nextInt();
        int[] presencas = new int[totalDias];
        int somaPresencas = 0;

        for (int i = 0; i < totalDias; i++) {
            System.out.print("Dia " + (i + 1) + " (1 para presente / 0 para falta): ");
            presencas[i] = sc.nextInt();
            if (presencas[i] == 1) {
                somaPresencas++;
            }
        }

        int faltas = totalDias - somaPresencas;
        double percentual = (double) somaPresencas / totalDias * 100;

        System.out.println("\n--- Relatório de Frequência ---");
        System.out.println("Total de presenças: " + somaPresencas);
        System.out.println("Total de faltas: " + faltas);
        System.out.printf("Percentual de presença: %.2f%%\n", percentual);

        sc.close();
    }
}
