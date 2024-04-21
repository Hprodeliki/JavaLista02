package Exercicios;
import java.util.Scanner;

public class Exercicio09 {
    public static void executar() {
        int[] A = new int[5];
        int[] B = new int[5];
        int[] C = new int[5];

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

        for (int i = 0; i < C.length; i++) {
            if (i % 2 == 0) { 
                C[i] = A[i];
            } else { 
                C[i] = B[i];
            }
        }

        System.out.println("Vetor C de acordo com as regras:");
        for (int valor : C) {
            System.out.print(valor + " ");
        }
        
    }
}
