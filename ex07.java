import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        System.out.println("Digite 5 números");
        for(int i = 0; i<5; i++){
            System.out.println("Número " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }
        for(int i = 0; i<5; i++){
            soma += numeros[i];
        }
        System.out.println(soma);
        sc.close();
    }
}
