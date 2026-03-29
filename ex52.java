import java.util.Scanner;

public class ex52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Vetor[" + i + "]: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Sequências crescentes encontradas:");
        
        for (int i = 0; i < n; i++) {
            
            if (i < n - 1 && vetor[i] < vetor[i + 1]) {
                System.out.print(vetor[i] + " ");
                
                
                while (i < n - 1 && vetor[i] < vetor[i + 1]) {
                    System.out.print(vetor[i + 1] + " ");
                    i++;
                }
                System.out.println(); 
            }
        }

        sc.close();
    }
}