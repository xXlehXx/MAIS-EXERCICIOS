import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 números.");

        System.out.println("Número 1: ");
        double n1 = sc.nextInt();

        System.out.println("Número 2: ");
        double n2 = sc.nextInt();

        System.out.println("Número 3: ");
        double n3 = sc.nextInt();

        double m = (n1+n2+n3) / 3;
        
        System.out.printf("A média dos valores é %.2f",m);
        sc.close();
    }
}
