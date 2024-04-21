package Exercicios;
import java.util.Scanner;

public class Exercicio08 {
    public static void executar() {
        int[] A = new int[5];
        int[] B = new int[5];

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o elemento " + (i + 1) + ": ");
            A[i] = leitor.nextInt();
        }

        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.println("Digite o elemento " + (i + 1) + ": ");
            B[i] = leitor.nextInt();
        }
        leitor.close();

        int[] C = new int[A.length + B.length];
        for (int i = 0; i < A.length; i++) {
            C[i] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            C[A.length + i] = B[i];
        }

        System.out.println("Vetor C (concatenação de A e B):");
        for (int valor : C) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
