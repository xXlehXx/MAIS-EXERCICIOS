import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        if (numero % 5 == 0) {
            System.out.println("É múltiplo de 5");
        } else {
            System.out.println("Não é múltiplo de 5");
        }

        sc.close();
    }
}
