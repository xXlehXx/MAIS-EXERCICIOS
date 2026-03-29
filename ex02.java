import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número");
        int num1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();
        if(num1>num2){
            System.out.printf("O número %d é maior que %d",num1,num2);
        }
        else{
            System.out.printf("O número %d é maior que %d",num2,num1);
        }
        sc.close();
    }
}
