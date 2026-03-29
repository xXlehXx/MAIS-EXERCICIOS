import java.util.Scanner;

public class ex61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        double soma = 0;
        int aprovados = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            soma += notas[i];
        }

        double maiorNota = notas[0];
        double media = soma / 10;

        for (int i = 0; i < 10; i++) {
            if (notas[i] > 6) {
                aprovados++;
            }
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }

        System.out.println("\n--- Relatório Final ---");
        System.out.println("Média da turma: " + media);
        System.out.println("Quantidade de aprovados: " + aprovados);
        System.out.println("Maior nota registrada: " + maiorNota);

        sc.close();
    }
}
