package Exercicios;
import java.util.Scanner;


public class Exercicio13 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("digite um tamnho para a sequencia de fibonacci: ");
        int n = leitor.nextInt();

        int[] fibo = new int[n];
        fibo[0] = 1;
        fibo[1] = 1;
        for (int i = 2; i < n; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        System.out.println("os " + n + " primeiros termos da sequência de fibonacci sao:");
        for (int num : fibo) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
