import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para mostrar a sua tabuada: ");
        int n = sc.nextInt();

        for(int i = 0; i<10; i++){
            System.out.println((i+1) + "x" + n + " = " + ((i+1)*n));
        }
        sc.close();
    }
}
