import java.util.Scanner;

public class ex54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetorOriginal = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Vetor[" + i + "]: ");
            vetorOriginal[i] = sc.nextInt();
        }

        int novosElementos = 0;
        for (int i = 0; i < n; i++) {
            if (vetorOriginal[i] != 0) {
                novosElementos++;
            }
        }

        int[] vetorCompacto = new int[novosElementos];
        int j = 0;

        
        for (int i = 0; i < n; i++) {
            if (vetorOriginal[i] != 0) {
                vetorCompacto[j] = vetorOriginal[i];
                j++;
            }
        }

        
        System.out.println("Vetor compactado (sem zeros):");
        if (novosElementos == 0) {
            System.out.println("O vetor resultante está vazio.");
        } else {
            for (int i = 0; i < novosElementos; i++) {
                System.out.print(vetorCompacto[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}