package Exercicios;
import java.util.Scanner;

public class Exercicio14 {
    public static void executar() {
        int[] vetor = new int[5];

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite os elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o elemento " + (i + 1) + ": ");
            vetor[i] = leitor.nextInt();
        }
        leitor.close();
        int indiceMaior = 0;
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }
        int temp = vetor[indiceMaior];

        vetor[indiceMaior] = vetor[vetor.length - 1];
        vetor[vetor.length - 1] = temp;

        System.out.println("Vetor atualizado:");
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
