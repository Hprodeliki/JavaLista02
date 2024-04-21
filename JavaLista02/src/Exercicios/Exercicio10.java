package Exercicios;
import java.util.Scanner;

public class Exercicio10 {
    public static void executar() {
        int[] A = new int[5];
        int[] B = new int[5];

        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o elemento " + (i + 1) + ": ");
            A[i] = leitor.nextInt();
        }
        leitor.close();

        for (int i = 0; i < A.length; i++) {
            B[i] = A[A.length - 1 - i];
        }

        System.out.println("Vetor B (elementos de A copiados de forma invertida):");
        for (int valor : B) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
