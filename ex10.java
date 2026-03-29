import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int[] num = new int[5];
        System.out.println("Digite 5 números");
        for(int i = 0; i<5; i++){
            System.out.println("Número " + (1+i) + ": ");
            num[i] = sc.nextInt();
            if(num[i] > 0){
                contador++;
            }
        }
        System.out.println("Existem " + contador + " números positivos");
        sc.close();
    }
}
