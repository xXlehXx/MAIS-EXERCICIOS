import java.util.Scanner;

public class ex63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lampadaA = 0;
        int lampadaB = 0;

        System.out.print("Quantas vezes os interruptores foram pressionados? ");
        int n = sc.nextInt();

        int[] interruptores = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Interruptor pressionado (1 ou 2): ");
            interruptores[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (interruptores[i] == 1) {
                if (lampadaA == 0) {
                    lampadaA = 1;
                } else {
                    lampadaA = 0;
                }
            } else if (interruptores[i] == 2) {
                if (lampadaA == 0) {
                    lampadaA = 1;
                } else {
                    lampadaA = 0;
                }

                if (lampadaB == 0) {
                    lampadaB = 1;
                } else {
                    lampadaB = 0;
                }
            }
        }

        System.out.println(lampadaA);
        System.out.println(lampadaB);

        sc.close();
    }
}