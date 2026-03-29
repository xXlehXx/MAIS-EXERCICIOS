import java.util.Scanner;

public class ex8_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 0, menor = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            int num = sc.nextInt();

            if (i == 0) {
                maior = num;
                menor = num;
            } else {
                if (num > maior) maior = num;
                if (num < menor) menor = num;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        sc.close();
    }
}
