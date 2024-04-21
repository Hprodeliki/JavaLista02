package Exercicios;
import java.util.Scanner;

public class Exercicio11 {
    public static void executar() {
        int[] A = new int[5];
        int[] B = new int[5];

        Scanner leitor = new Scanner(System.in);

        System.out.println("Escreva os elementos do vetor 1:");
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite o elemento " + (i + 1) + ": ");
            A[i] = leitor.nextInt();
        }

        System.out.println("Digite os elementos do vetor 2:");
        for (int i = 0; i < B.length; i++) {
            System.out.println("Digite o elemento " + (i + 1) + ": ");
            B[i] = leitor.nextInt();
        }
        leitor.close();

        int produtoEscalar = 0;
        for (int i = 0; i < A.length; i++) {
            produtoEscalar += A[i] * B[i];
        }

        System.out.println("O produto escalar dos vetores 1 e 2 é: " + produtoEscalar);
    }
}
