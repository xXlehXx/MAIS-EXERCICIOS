import java.util.Scanner;

public class ex65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de dias: ");
        int n = sc.nextInt();
        
        int[] acessosDiarios = new int[n];
        int somaAcessos = 0;
        int diaDoPremio = -1;

        for (int i = 0; i < n; i++) {
            System.out.print("Acessos no dia " + (i + 1) + ": ");
            acessosDiarios[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            somaAcessos += acessosDiarios[i];
            
            if (somaAcessos >= 1000000) {
                diaDoPremio = i + 1;
                break;
            }
        }

        System.out.println(diaDoPremio);

        sc.close();
    }
}

