package Exercicios;
import java.util.Scanner;

public class Exercicio12 {
    public static void executar() {
        int[] vetor = new int[12];

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
          System.out.println("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = leitor.nextInt();
        }
        leitor.close();
        long produto = 1;
        for (int num : vetor) {
            if (num > 0 && num % 2 == 0) {
                produto *= num;
            }
        }
        System.out.println("O produto dos pares positivos são : " + produto);
    }
}
